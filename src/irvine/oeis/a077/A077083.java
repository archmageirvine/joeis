package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077083 Length of iteration until a fixed point is reached when phi(sigma[n]+phi(n)) = A077080(n) is iterated with initial value of n.
 * @author Sean A. Irvine
 */
public class A077083 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    long cnt = 0;
    while (true) {
      ++cnt;
      final Z s = Functions.PHI.z(Functions.SIGMA1.z(t).add(Functions.PHI.z(t)));
      if (s.equals(t)) {
        return Z.valueOf(cnt);
      }
      t = s;
    }
  }
}

