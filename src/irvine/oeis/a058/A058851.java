package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a005.A005843;
import irvine.util.string.StringUtils;

/**
 * A058851 Sum of even composites up to n is palindromic.
 * @author Sean A. Irvine
 */
public class A058851 extends A005843 {

  /** Construct the sequence. */
  public A058851() {
    super(1);
  }

  private Z mN = Z.ZERO;

  {
    super.next(); // skip 0
    super.next(); // skip 2
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      mN = mN.add(t);
      if (StringUtils.isPalindrome(mN.toString())) {
        return t;
      }
    }
  }
}
