package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082598 Palindromic prime units W appearing twice in first-order fractal palindromic primes WmW.
 * @author Sean A. Irvine
 */
public class A082598 extends A082584 {

  private String mPrev = "";

  @Override
  public Z next() {
    while (true) {
      final String t = super.next().toString();
      final String left = t.substring(0, t.length() / 2);
      if (!mPrev.equals(left)) {
        mPrev = left;
        return new Z(left);
      }
    }
  }
}
