package irvine.oeis.a051;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A051912 a(n) is the smallest integer such that the sum of any three ordered terms a(k), k &lt;= n, is unique.
 * @author Sean A. Irvine
 */
public class A051912 extends MemorySequence {

  private final TreeSet<Z> mSums = new TreeSet<>();

  private boolean isOk(final Z n) {
    if (mSums.contains(n)) {
      return false;
    }
    for (final Z a : this) {
      final Z an = a.add(n);
      if (mSums.contains(an.add(n))) {
        return false;
      }
      for (final Z b : this) {
        if (mSums.contains(an.add(b))) {
          return false;
        }
        if (b.equals(a)) {
          break;
        }
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      mSums.add(Z.ZERO);
      return Z.ZERO;
    }
    Z n = a(size() - 1);
    while (true) {
      n = n.add(1);
      if (isOk(n)) {
        mSums.add(n.multiply(3));
        for (final Z a : this) {
          final Z an = a.add(n);
          mSums.add(an.add(n)); // a + 2n
          for (final Z b : this) {
            mSums.add(an.add(b));
            if (b.equals(a)) {
              break;
            }
          }
        }
        return n;
      }
    }
  }
}
