package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077768 Number of times that the sum of two squares is an integer between n^2 and (n+1)^2; multiple representations are counted multiply.
 * @author Sean A. Irvine
 */
public class A077768 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long lower = mN * mN;
    final long upper = (mN + 1) * (mN + 1);
    long cnt = 0;
    long i = mN;
    long j = 0;
    while (i >= j) {
      j = 1;
      while (i * i + j * j < upper) {
        if (i >= j && i * i + j * j > lower) {
          ++cnt;
        }
        ++j;
      }
      --i;
      --j;
    }
    return Z.valueOf(cnt);
  }
}

