package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a007.A007623;
import irvine.util.string.StringUtils;

/**
 * A046807 Palindromes in factorial base.
 * @author Sean A. Irvine
 */
public class A046807 extends A007623 {

  private long mM = -1;

  @Override
  public Z next() {
    while (true) {
      ++mM;
      final Z t = super.next();
      if (StringUtils.isPalindrome(t.toString())) {
        return Z.valueOf(mM);
      }
    }
  }
}
