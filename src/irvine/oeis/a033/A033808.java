package irvine.oeis.a033;

import java.util.TreeSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A033808 All slopes (a(n)-a(m))/(n-m) are distinct; generated from 0 by greedy algorithm.
 * @author Sean A. Irvine
 */
public class A033808 extends MemorySequence {

  private final TreeSet<Q> mSeen = new TreeSet<>();

  private boolean isOk(final Z n) {
    final int s = size();
    for (int k = 0; k < s; ++k) {
      if (!mSeen.add(new Q(n.subtract(a(k)), s - k))) {
        // Not ok, unwind
        for (int j = 0; j < k; ++j) {
          mSeen.remove(new Q(n.subtract(a(j)), s - j));
        }
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ZERO;
    }
    Z b = a(size() - 1);
    do {
      b = b.add(1);
    } while (!isOk(b));
    return b;
  }
}
