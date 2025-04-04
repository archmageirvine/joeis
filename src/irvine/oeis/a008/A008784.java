package irvine.oeis.a008;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008784 Numbers k such that sqrt(-1) mod k exists; or, numbers that are primitively represented by x^2 + y^2.
 * @author Sean A. Irvine
 */
public class A008784 extends Sequence1 {

  // After Charles R. Greathouse IV

  private long mN = 0;

  private boolean is(long n) {
    if ((n & 1) == 0) {
      if ((n & 3) == 0) {
        return false;
      }
      n >>>= 1;
    }
    if (n == 1) {
      return true;
    }
    for (final Z p : Jaguar.factor(n).toZArray()) {
      final long s = p.mod(4);
      if (s > 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }

}


