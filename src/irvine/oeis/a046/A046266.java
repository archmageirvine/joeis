package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046266 Largest palindromic substring in 8^n.
 * @author Sean A. Irvine
 */
public class A046266 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(8);
    return new Z(A046260.largestPalindromicSubstring(mA.toString()));
  }
}
