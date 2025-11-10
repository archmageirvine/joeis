package irvine.oeis.a081;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081755 Number of noncongruent solutions to x^(2^m) == 1 (mod n) when n is such that the number of solutions is the same for any m&gt;=1.
 * @author Sean A. Irvine
 */
public class A081755 extends Sequence1 {

  private long mN = 0;

  private long count(final long n, final long e) {
    long count = 0;
    for (long k = 1; k < n; ++k) {
      if (LongUtils.modPow(k, e, n) == 1) {
        ++count;
      }
    }
    return count;
  }

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE; // Avoids need for 1 % n in count
    }
    while (true) {
      ++mN;
      final long c1 = count(mN, 2);
      // It seems it is sufficient to simply check 2 values
      if (count(mN, 4) == c1 /*&& count(mN, 8) == c1*/) {
        return Z.valueOf(c1);
      }
    }
  }
}

