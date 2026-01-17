package irvine.oeis.a392;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392329 a(n) is the number of iterations x-&gt;gpf(6*x+1) starting at n until the value 13 or 47 is reached; a(n) = -1 if neither of these two values is reached.
 * @author Sean A. Irvine
 */
public class A392329 extends Sequence1 {

  private static final Z Z13 = Z.valueOf(13);
  private static final Z Z47 = Z.valueOf(47);
  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    long cnt = 0;
    final HashSet<Z> seen = new HashSet<>();
    while (!t.equals(Z13) && !t.equals(Z47)) {
      t = Functions.GPF.z(t.multiply(6).add(1));
      if (!seen.add(t)) {
        return Z.NEG_ONE;
      }
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

