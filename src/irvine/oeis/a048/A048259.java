package irvine.oeis.a048;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Triple;

/**
 * A048259 Number of distinct solutions to x + y + z = 0 (mod n), where two solutions are equivalent if one can be obtained from the other by multiplying by units in Z/nZ and permuting x,y,z.
 * @author Sean A. Irvine
 */
public class A048259 implements Sequence {

  private long mN = -1;

  private void add(final HashSet<Triple<Long>> seen, final long x, final long y, final long z) {
    // Multiply solution (x,y,z) by each unit, keep largest solution up to permutation
    long sx = x;
    long sy = y;
    long sz = z;
    for (long k = 2; k < mN; ++k) {
      if (LongUtils.gcd(k, mN) == 1) {
        final long[] abs = {(x * k) % mN, (y * k) % mN, (z * k) % mN};
        Arrays.sort(abs); // sorts ascending!
        if (abs[2] > sx || (abs[2] == sx && (abs[1] > sy || (abs[1] == sy && abs[0] > z)))) {
          sx = abs[2];
          sy = abs[1];
          sz = abs[0];
        }
      }
    }
    seen.add(new Triple<>(sx, sy, sz));
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    // Generate all combinations 0 <= z <= y <= x <= mN
    final HashSet<Triple<Long>> seen = new HashSet<>();
    for (long x = 0; x < mN; ++x) {
      for (long y = 0; y <= x; ++y) {
        for (long z = 0; z <= y; ++z) {
          final long s = x + y + z;
          if (s % mN == 0) {
            add(seen, x, y, z);
          }
        }
      }
    }
    return Z.valueOf(seen.size());
  }

}
