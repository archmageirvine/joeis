package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;
import irvine.util.string.StringUtils;

/**
 * A046358 Composite numbers divisible by the palindromic sum of their prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046358 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final Z sopfr = Jaguar.factor(c).sopfr();
      if (StringUtils.isPalindrome(sopfr.toString()) && c.mod(sopfr).isZero()) {
        return c;
      }
    }
  }
}
