package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a071.A071904;
import irvine.util.string.StringUtils;

/**
 * A046353 Odd composite numbers whose sum of prime factors is palindromic (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046353 extends A071904 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (StringUtils.isPalindrome(Functions.SOPFR.z(t).toString())) {
        return t;
      }
    }
  }
}
