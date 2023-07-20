package irvine.oeis.a062;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A062065 a(1) = 1; for n &gt;= 1, a(n+1) is smallest number such that the sums of any one, two or three of a(1), ..., a(n) are distinct (repetitions not allowed).
 * @author Sean A. Irvine
 */
public class A062065 extends MemorySequence {

  private final TreeSet<Z> mSums = new TreeSet<>();

  {
    setOffset(1);
  }

  private boolean isOk(final Z n) {
    if (mSums.contains(n)) {
      return false;
    }
    for (final Z a : this) {
      final Z an = a.add(n);
      if (mSums.contains(an)) {
        return false;
      }
      for (final Z b : this) {
        if (b.equals(a)) {
          break;
        }
        if (mSums.contains(an.add(b))) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      mSums.add(Z.ONE);
      return Z.ONE;
    }
    Z n = a(size() - 1);
    while (true) {
      n = n.add(1);
      if (isOk(n)) {
        for (final Z a : this) {
          final Z an = a.add(n);
          for (final Z b : this) {
            if (b.equals(a)) {
              break;
            }
            mSums.add(an.add(b));
          }
          mSums.add(an); // a + n
        }
        mSums.add(n);
        return n;
      }
    }
  }
}
