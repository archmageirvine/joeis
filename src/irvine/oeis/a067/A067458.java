package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A067458 Sum of remainders when n is divided by its nonzero digits.
 * @author Sean A. Irvine
 */
public class A067458 extends AbstractSequence {

  /** Construct the sequence. */
  public A067458() {
    super(10);
  }

  private long mN = 9;

  @Override
  public Z next() {
    long m = ++mN;
    long s = 0;
    while (m != 0) {
      final long r = m % 10;
      if (r != 0) {
        s += mN % r;
      }
      m /= 10;
    }
    return Z.valueOf(s);
  }
}

