package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a071.A071904;
import irvine.util.string.StringUtils;

/**
 * A046359 Odd numbers divisible by the palindromic sum of their prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046359 extends A071904 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final Z sopfr = Cheetah.factor(c).sopfr();
      if (StringUtils.isPalindrome(sopfr.toString()) && c.mod(sopfr).isZero()) {
        return c;
      }
    }
  }
}
