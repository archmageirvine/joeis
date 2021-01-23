package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030097 Numbers n such that n^2 has only even digits.
 * @author Sean A. Irvine
 */
public class A030097 implements Sequence {

  private Z mN = Z.NEG_ONE;

  private boolean isAllEvenDigits(Z n) {
    while (!n.isZero()) {
      if (!n.isEven()) {
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
      if (isAllEvenDigits(mN.square())) {
        return mN;
      }
    }
  }
}
