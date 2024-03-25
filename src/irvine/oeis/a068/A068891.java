package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068891 a(1) = 1; a(n) = smallest nontrivial n-th power with property that digits alternate in parity individually as well as in concatenation with previous terms.
 * @author Sean A. Irvine
 */
public class A068891 extends Sequence1 {

  private int mN = 0;
  private Z mPrev = Z.ONE;

  private boolean is(Z n) {
    boolean parity = n.isEven();
    while (true) {
      n = n.divide(10);
      if (n.isZero()) {
        return parity == mPrev.isOdd();
      }
      if (n.isEven() == parity) {
        return false;
      }
      parity = !parity;
    }
  }

  @Override
  public Z next() {
    if (mN == 9) {
      return null; // a(10) does not exist, sequence if finite
    }
    if (++mN == 1) {
      return Z.ONE;
    }
    long k = 1;
    while (true) {
      final Z s = Z.valueOf(++k).pow(mN);
      if (is(s)) {
        mPrev = s;
        return s;
      }
    }
  }
}
