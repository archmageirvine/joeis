package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a000.A000384;
import irvine.util.string.StringUtils;

/**
 * A054970 Index numbers for palindromic hexagonal numbers.
 * @author Sean A. Irvine
 */
public class A054970 extends A000384 {

  /** Construct the sequence. */
  public A054970() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z hex = super.next();
      if (StringUtils.isPalindrome(hex.toString())) {
        return mN;
      }
    }
  }
}
