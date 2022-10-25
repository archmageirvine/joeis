package irvine.oeis.a010;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A010672 A B_2 sequence: a(n) = least value such that sequence increases and pairwise sums of distinct elements are all distinct.
 * @author Sean A. Irvine
 */
public class A010672 extends MemorySequence {

  private final HashSet<Z> mSums = new HashSet<>();

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ZERO;
    }
    Z n = a(size() - 1);
    while (true) {
      n = n.add(1);
      boolean ok = true;
      for (final Z m : this) {
        if (mSums.contains(n.add(m))) {
          ok = false;
          break;
        }
      }
      if (ok) {
        for (final Z m : this) {
          mSums.add(n.add(m));
        }
        return n;
      }
    }
  }
}
