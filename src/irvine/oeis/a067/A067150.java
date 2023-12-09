package irvine.oeis.a067;

import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067150 Number of integers i=1,2,...,n such that (n,i) has Property F3*, i.e., i and n are consecutive terms of a sequence b(k) satisfying b(1)=1, b(n) = (b(n-1) OR 2*b(n-1)) + b(n-2), where the OR is taken bitwise.
 * @author Sean A. Irvine
 */
public class A067150 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> seen = new HashSet<>();
    for (long k = 1; k < mN; ++k) {
      long f0 = 1;
      long f1 = k;
      while (f1 <= mN) {
        if (f1 == mN) {
          seen.add(f0);
        }
        final long t = LongUtils.numbralMultiply(3, f1) + f0;
        f0 = f1;
        f1 = t;
      }
    }
    return Z.valueOf(seen.size());
  }
}
