package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A046355 Composite numbers with only palindromic prime factors whose sum is palindromic (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046355 extends A046349 {

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
