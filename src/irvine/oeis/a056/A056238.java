package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a007.A007622;
import irvine.util.string.StringUtils;

/**
 * A056238 Nontrivial palindromic denominators in Leibniz's harmonic triangle.
 * @author Sean A. Irvine
 */
public class A056238 extends A007622 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (StringUtils.isPalindrome(t.toString())) {
        return t;
      }
    }
  }
}

