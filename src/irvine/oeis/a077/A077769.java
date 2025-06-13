package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077769 Number of times that the sum of two coprime squares of opposite parity is an integer between n^2 and (n+1)^2; multiple representations are counted multiply.
 * @author Sean A. Irvine
 */
public class A077769 extends Sequence1 {

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
        if (i >= j && (i & 1) != (j & 1) && i * i + j * j > lower && Functions.GCD.l(i, j) == 1) {
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

