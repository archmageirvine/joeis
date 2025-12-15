package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a067.A067899;

/**
 * A082599 Palindromic prime units W appearing four times in second-order fractal palindromic primes WxWmWxW, where part WxW is also a palindromic prime.
 * @author Sean A. Irvine
 */
public class A082599 extends A067899 {

  private String mPrev = "";

  @Override
  public Z next() {
    while (true) {
      final String t = super.next().toString();
      final String left = t.substring(0, t.length() / 4);
      if (!mPrev.equals(left)) {
        mPrev = left;
        return new Z(left);
      }
    }
  }
}
