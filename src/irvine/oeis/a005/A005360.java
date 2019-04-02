package irvine.oeis.a005;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005360 Flimsy numbers.
 * @author Sean A. Irvine
 */
public class A005360 implements Sequence {

  // Implemented using the description by T.D. Noe in A125121.
  // This is more robust than the existing programs in A005360

  private long mN = 10;
  private final HashSet<Long> mResidues = new HashSet<>(); // Avoid reallocating

  @Override
  public Z next() {
    while (true) {
      mResidues.clear();
      ++mN;
      long a = 2;
      while (mResidues.add(a)) {
        a *= 2;
        a %= mN;
      }
      final int c = Long.bitCount(mN);
      Set<Long> prev = Collections.singleton(0L);
      for (int k = 1; k < c; ++k) {
        final HashSet<Long> sums = new HashSet<>();
        for (final long v : prev) {
          for (final long r : mResidues) {
            sums.add((v + r) % mN);
          }
        }
        if (sums.contains(0L)) {
          return Z.valueOf(mN);
        }
        prev = sums;
      }
    }
  }
}
