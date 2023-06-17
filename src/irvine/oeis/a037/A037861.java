package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A037861 (Number of 0's) - (number of 1's) in the base-2 representation of n.
 * @author Sean A. Irvine
 */
public class A037861 extends AbstractSequence {

  /* Construct the sequence. */
  public A037861() {
    super(0);
  }

  private long mN = -1;

  protected long base() {
    return 2;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long cnt = 0;
    long m = mN;
    while (m != 0) {
      final long b = m % base();
      m /= base();
      if (2 * b < base()) {
        ++cnt;
      } else {
        --cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
