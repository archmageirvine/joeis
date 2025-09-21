package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A080454.
 * @author Sean A. Irvine
 */
public class A080464 extends AbstractSequence {

  /** Construct the sequence. */
  public A080464() {
    super(10);
  }

  private long mN = 9;

  @Override
  public Z next() {
    long m = ++mN;
    final long[] sum = new long[2];
    int k = 0;
    while (m != 0) {
      sum[k] += m % 10;
      k = 1 - k;
      m /= 10;
    }
    return Z.valueOf(sum[0]).multiply(sum[1]);
  }
}

