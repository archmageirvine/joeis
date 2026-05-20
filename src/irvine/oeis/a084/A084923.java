package irvine.oeis.a084;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084923 Consider the sequence b(1) = n, b(k) is the greatest prime factor of 3*b(k-1)+2. It is conjectured that this always becomes cyclic; a(n) = length of cycle (or 0 if no cycle is reached).
 * @author Sean A. Irvine
 */
public class A084923 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    final HashSet<Z> seen = new HashSet<>();
    seen.add(t);
    long k = 0;
    while (true) {
      t = Functions.GPF.z(t.multiply(3).add(2));
      ++k;
      if (!seen.add(t)) {
        return Z.valueOf(k);
      }
    }
  }
}
