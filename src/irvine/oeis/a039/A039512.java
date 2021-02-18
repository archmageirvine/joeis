package irvine.oeis.a039;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039512 T(n,1..i) are attractors in '3x+(2n+1)' problem.
 * @author Sean A. Irvine
 */
public class A039512 implements Sequence {

  // Heuristic
  private static final long MAX = 100000;

  private final TreeSet<Z> mMin = new TreeSet<>();
  private long mN = -1;

  private Z run(Z n, final long add) {
    final TreeSet<Z> seen = new TreeSet<>();
    while (seen.add(n)) {
      n = n.isEven() ? n.divide2() : n.multiply(3).add(add);
    }
    // Found a cycle, not redo and find the minimum value of the cycle
    seen.clear();
    while (seen.add(n)) {
      n = n.isEven() ? n.divide2() : n.multiply(3).add(add);
    }
    return seen.first();
  }

  @Override
  public Z next() {
    if (mMin.isEmpty()) {
      mN += 2;
      for (long k = 1; k <= MAX; ++k) {
        mMin.add(run(Z.valueOf(k), mN));
      }
    }
    return mMin.pollFirst();
  }
}
