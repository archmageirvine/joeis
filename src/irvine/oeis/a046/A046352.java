package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;
import irvine.util.string.StringUtils;

/**
 * A046352 Composite numbers whose sum of prime factors is palindromic (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046352 extends A002808 {

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
