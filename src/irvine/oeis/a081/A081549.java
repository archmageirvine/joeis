package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A081549 <code>a(1) = 1</code>; for <code>n &gt; 1, a(n) &gt; a(n-1)</code> is the smallest number such that the concatenation <code>a(1)a(2)a(3)..</code>. forms a cyclic concatenation of <code>123456789</code> (of nonzero digits).
 * @author Sean A. Irvine
 */
public class A081549 implements Sequence {

  private int mLastDigit = 0;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    Z n = Z.ZERO;
    while (n.compareTo(mA) <= 0) {
      if (++mLastDigit == 10) {
        mLastDigit = 1;
      }
      n = n.multiply(10).add(mLastDigit);
    }
    mA = n;
    return n;
  }
}

