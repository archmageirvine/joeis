package irvine.oeis.a390;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390033 allocated for Ali Sada.
 * @author Sean A. Irvine
 */
public class A390033 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<List<Long>> cycles = new HashSet<>();
    for (long k = 0; k < mN; ++k) {
      final HashSet<Long> alreadySolved = new HashSet<>();
      for (long j = 0; j < mN; ++j) {
        // Handle potential pre-period
        final HashSet<Long> seen = new HashSet<>();
        long i = j;
        while (seen.add(i)) {
          if (alreadySolved.contains(i)) {
            break;
          }
          i = (i * k) % mN;
        }
        if (!alreadySolved.contains(i)) {
          // Find minimum
          final long u = i;
          long min = i;
          do {
            i = (i * k) % mN;
            if (i < min) {
              min = i;
            }
          } while (i != u);

          // Now form the cycle (removes any pre-period)
          final List<Long> cycle = new ArrayList<>();
          i = min;
          do {
            cycle.add(i);
            i = (i * k) % mN;
          } while (i != min);
          cycles.add(cycle);
          alreadySolved.addAll(seen);
        }
      }
    }
    return Z.valueOf(cycles.size());
  }
}

