package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030099 Numbers n such that n^3 has only odd digits.
 * @author Sean A. Irvine
 */
public class A030099 implements Sequence {

  private Z mN = Z.ZERO;

  private boolean isAllOddDigits(Z n) {
    while (!Z.ZERO.equals(n)) {
      if (n.isEven()) {
        return false;
      }
      n = n.divide(10);
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (isAllOddDigits(mN.pow(3))) {
        return mN;
      }
    }
  }
}
