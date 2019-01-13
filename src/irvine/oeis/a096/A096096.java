package irvine.oeis.a096;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A096096.
 * @author Sean A. Irvine
 */
public class A096096 implements Sequence {

  private String mA = null;
  private String mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = "1";
      return Z.ONE;
    } else if (mB == null) {
      mB = "2";
      return Z.TWO;
    }
    final StringBuilder digitProduct = new StringBuilder();
    if (mA.length() <= mB.length()) {
      final int delta = mB.length() - mA.length();
      for (int k = 0; k < mA.length(); ++k) {
        digitProduct.append(String.valueOf((mA.charAt(k) - '0') * (mB.charAt(delta + k) - '0')));
      }
    } else {
      final int delta = mA.length() - mB.length();
      for (int k = 0; k < mB.length(); ++k) {
        digitProduct.append(String.valueOf((mA.charAt(delta + k) - '0') * (mB.charAt(k) - '0')));
      }
    }
    mA = mB;
    mB = digitProduct.toString();
    return new Z(mB);
  }
}

