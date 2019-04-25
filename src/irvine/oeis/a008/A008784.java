package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008784 Numbers n such that <code>sqrt(-1) mod n</code> exists; or, numbers n that are primitively represented by <code>x^2 + y^2</code>.
 * @author Sean A. Irvine
 */
public class A008784 implements Sequence {

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
    for (final Z p : Cheetah.factor(n).toZArray()) {
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


