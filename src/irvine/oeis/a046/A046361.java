package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;
import irvine.util.string.StringUtils;

/**
 * A046361 Composite a(n) divided by the palindromic sum of its prime factors is a palindrome (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046361 extends A002808 {

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
