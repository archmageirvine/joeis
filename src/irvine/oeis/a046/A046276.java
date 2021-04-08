package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A046276 Largest palindromic substring in n! without an initial zero.
 * @author Sean A. Irvine
 */
public class A046276 extends A000142 {

  @Override
  public Z next() {
    return new Z(A046260.largestPalindromicSubstring(super.next().toString()));
  }
}
