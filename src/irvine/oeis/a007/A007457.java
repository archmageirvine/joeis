package irvine.oeis.a007;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007457 Number of <code>(j,k): j+k=n, (j,n)=(k,n)=1</code>, j,k squarefree.
 * @author Sean A. Irvine
 */
public class A007457 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long j = 1; j < mN; ++j) {
      if (LongUtils.gcd(j, mN) == 1 && LongUtils.isSquareFree(j)) {
        final long k = mN - j;
        if (LongUtils.gcd(k, mN) == 1 && LongUtils.isSquareFree(k)) {
          ++count;
        }
      }
    }
    return Z.valueOf(count);
  }
}

