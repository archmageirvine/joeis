package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056155 Positive integer k, 1 &lt;= k &lt;= n, which maximizes k^(n+1-k).
 * @author Sean A. Irvine
 */
public class A056155 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    long maxK = 1;
    for (long k = 1; k <= mN; ++k) {
      final Z j = Z.valueOf(k).pow(mN + 1 - k);
      if (j.compareTo(max) > 0) {
        max = j;
        maxK = k;
      }
    }
    return Z.valueOf(maxK);
  }
}

