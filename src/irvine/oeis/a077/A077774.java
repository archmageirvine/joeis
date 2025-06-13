package irvine.oeis.a077;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077774 Number of integers between n^2 and (n+1)^2 that are the sum of two coprime squares of opposite parity; multiple representations are counted once.
 * @author Sean A. Irvine
 */
public class A077774 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long lower = mN * mN;
    final long upper = (mN + 1) * (mN + 1);
    final HashSet<Long> res = new HashSet<>();
    long i = mN;
    long j = 0;
    while (i >= j) {
      j = 1;
      while (i * i + j * j < upper) {
        if (i >= j && (i & 1) != (j & 1) && i * i + j * j > lower && Functions.GCD.l(i, j) == 1) {
          res.add(i * i + j * j);
        }
        ++j;
      }
      --i;
      --j;
    }
    return Z.valueOf(res.size());
  }
}

