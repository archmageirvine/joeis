package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A049502 Major index of n, 2nd definition.
 * @author Sean A. Irvine
 */
public class A049502 extends AbstractSequence implements DirectSequence {

  private long mN = -1;

  /** Construct the sequence. */
  public A049502() {
    super(0);
  }

  @Override
  public Z next() {
    long m = ++mN;
    long sum = 0;
    long k = 1;
    while (m > 1) {
      if ((m & 3) == 1) {
        sum += k;
      }
      ++k;
      m >>>= 1;
    }
    return Z.valueOf(sum);
  }

  @Override
  public Z a(final int n) {
    long m = n;
    long sum = 0;
    long k = 1;
    while (m > 1) {
      if ((m & 3) == 1) {
        sum += k;
      }
      ++k;
      m >>>= 1;
    }
    return Z.valueOf(sum);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

}
