package irvine.oeis.a384;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A384666 Number of distinct values of the quadratic discriminant D=b^2-4*a*c, for a,b,c in the range [-n,n].
 * @author Sean A. Irvine
 */
public class A384666 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> set = new HashSet<>();
    for (long b = 0; b <= mN; ++b) {
      final long b2 = b * b;
      for (long a = 0; a <= mN; ++a) {
        for (long c = 0; c <= a; ++c) {
          set.add(b2 - 4 * a * c);
          set.add(b2 + 4 * a * c);
        }
      }
    }
    return Z.valueOf(set.size());
  }
}

