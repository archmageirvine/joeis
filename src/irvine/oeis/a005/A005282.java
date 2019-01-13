package irvine.oeis.a005;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005282.
 * @author Sean A. Irvine
 */
public class A005282 extends MemorySequence {

  private final TreeSet<Z> mSums = new TreeSet<>();

  @Override
  protected Z computeNext() {
    if (isEmpty()) {
      return Z.ONE;
    }
    Z n = get(size() - 1);
    while (true) {
      n = n.add(1);
      boolean ok = true;
      for (final Z a : this) {
        if (mSums.contains(a.add(n))) {
          ok = false;
        }
      }
      if (ok) {
        mSums.add(n.multiply2());
        for (final Z a : this) {
          mSums.add(a.add(n));
        }
        return n;
      }
    }
  }
}

