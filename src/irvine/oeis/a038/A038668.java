package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038668.
 * @author Sean A. Irvine
 */
public class A038668 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long a = 1;
    long b = 3;
    Z sum = Z.ZERO;
    while (b <= mN) {
      sum = sum.add(mN / b);
      final long t = a + b;
      a = b;
      b = t;
    }
    return sum;
  }

}

