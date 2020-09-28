package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a033.A033294;
import irvine.util.string.StringUtils;

/**
 * A035090 Non-palindromic squares which when written backwards remain square (and still have the same number of digits).
 * @author Sean A. Irvine
 */
public class A035090 extends A033294 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!StringUtils.isPalindrome(t.toString())) {
        return t;
      }
    }
  }
}
