package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.string.StringUtils;

/**
 * A007573 Number of asymmetric families of palindromic squares.
 * @author Sean A. Irvine
 */
public class A007573 extends AbstractSequence {

  /* Construct the sequence. */
  public A007573() {
    super(7);
  }

  private int mN = 0;

  private Z buildRoot(final String x, final int zeros) {
    return new Z("1" + x + "0" + StringUtils.rep('9', zeros + 1) + StringUtils.rep('0', zeros) + "1" + new StringBuilder(x).reverse() + "1");
  }

  private String str(final long x, final int len) {
    if (len == 0) {
      return "";
    }
    final String s = Long.toBinaryString(x);
    if (s.length() >= len) {
      return s;
    }
    return StringUtils.rep('0', len - s.length()) + s;
  }

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (int zeros = 0; zeros <= mN; ++zeros) {
      final int xLen = mN - zeros;
      final long lim = 1L << xLen;
      for (long x = 0; x < lim; ++x) {
        final Z root = buildRoot(str(x, xLen), zeros);
        final Z sqr = root.square();
        //System.out.println(root + " " + sqr);
        if (StringUtils.isPalindrome(sqr.toString())) {
          ++count;
        }
      }
    }
    return Z.valueOf(count);
  }
}
