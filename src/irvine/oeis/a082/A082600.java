package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082600 Palindromic prime units W appearing eight times in third-order fractal palindromic primes WvWxWvWmWvWxWvW, where parts WvWxWvW, WvW are also palindromic primes.
 * @author Sean A. Irvine
 */
public class A082600 extends A082589 {

  private String mPrev = "";

  @Override
  public Z next() {
    while (true) {
      final String t = super.next().toString();
      final String left = t.substring(0, t.length() / 8);
      if (!mPrev.equals(left)) {
        mPrev = left;
        return new Z(left);
      }
    }
  }
}
