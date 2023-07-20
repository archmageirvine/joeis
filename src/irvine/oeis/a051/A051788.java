package irvine.oeis.a051;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A051788 a(1) = 1, a(2) = 3; for n&gt;2, a(n) = least value &gt; a(n-1) such that pairwise differences are unique.
 * @author Sean A. Irvine
 */
public class A051788 extends MemorySequence {

  {
    setOffset(1);
  }

  private final TreeSet<Z> mDifferences = new TreeSet<>();

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    } else if (size() == 1) {
      mDifferences.add(Z.TWO);
      return Z.THREE;
    }
    Z n = a(size() - 1);
    while (true) {
      n = n.add(1);
      boolean ok = true;
      for (final Z a : this) {
        if (mDifferences.contains(n.subtract(a))) {
          ok = false;
        }
      }
      if (ok) {
        for (final Z a : this) {
          mDifferences.add(n.subtract(a));
        }
        return n;
      }
    }
  }
}

