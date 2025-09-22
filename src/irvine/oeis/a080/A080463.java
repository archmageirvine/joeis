package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080463 Sum of the two numbers formed by alternate digits of n.
 * @author Sean A. Irvine
 */
public class A080463 extends Sequence0 {

  private long mN = -1;

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
    return Z.valueOf(sum[0] + sum[1]);
  }
}

