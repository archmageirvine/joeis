package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046263 Largest palindromic substring in 5^n.
 * @author Sean A. Irvine
 */
public class A046263 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(5);
    return new Z(A046260.largestPalindromicSubstring(mA.toString()));
  }
}
