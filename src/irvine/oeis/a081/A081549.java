package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A081549 a(1) = 1; for n &gt; 1, a(n) &gt; a(n-1) is the smallest number such that the concatenation a(1)a(2)a(3)... forms a cyclic concatenation of 123456789 (of nonzero digits).
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

