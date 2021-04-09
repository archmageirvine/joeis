package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a032.A032350;
import irvine.util.string.StringUtils;

/**
 * A046362 Composite palindromes divided by the palindromic sum of their prime factors is a palindrome (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046362 extends A032350 {

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final Z sopfr = Cheetah.factor(c).sopfr();
      if (StringUtils.isPalindrome(sopfr.toString())) {
        final Z[] qr = c.divideAndRemainder(sopfr);
        if (qr[1].isZero() && StringUtils.isPalindrome(qr[0].toString())) {
          return c;
        }
      }
    }
  }
}
