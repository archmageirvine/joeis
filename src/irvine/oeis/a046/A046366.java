package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A046366 Composite numbers divisible by the palindromic sum of their palindromic prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046366 extends A046349 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z sopfr = Cheetah.factor(t).sopfr();
      if (StringUtils.isPalindrome(sopfr.toString()) && t.mod(sopfr).isZero()) {
        return t;
      }
    }
  }
}
