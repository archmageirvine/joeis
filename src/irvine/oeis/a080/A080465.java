package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A080465 Absolute difference between the two numbers formed by alternate digits of n.
 * @author Sean A. Irvine
 */
public class A080465 extends AbstractSequence {

  /** Construct the sequence. */
  public A080465() {
    super(10);
  }

  private long mN = 9;

  @Override
  public Z next() {
    long m = ++mN;
    final long[] sum = new long[2];
    int k = 0;
    long j = 1;
    while (m != 0) {
      sum[k] += j * (m % 10);
      k = 1 - k;
      m /= 10;
      if (k == 0) {
        j *= 10;
      }
    }
    return Z.valueOf(sum[0] - sum[1]).abs();
  }
}

