package irvine.oeis.a051;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A051912 a(n) is the smallest integer such that the sum of any three ordered terms a(k), k &lt;= n, is unique.
 * @author Sean A. Irvine
 */
public class A051912 extends MemorySequence {

  private final TreeSet<Z> mSums = new TreeSet<>();

  @Override
  protected Z computeNext() {
    if (isEmpty()) {
      mSums.add(Z.ZERO);
      return Z.ZERO;
    }
    Z n = get(size() - 1);
    while (true) {
      n = n.add(1);
      if (!mSums.contains(n)) {
        boolean ok = true;
        outer:
        for (final Z a : this) {
          final Z an = a.add(n);
          if (mSums.contains(an.add(n))) {
            ok = false;
            break;
          }
          for (final Z b : this) {
            if (mSums.contains(an.add(b))) {
              ok = false;
              break outer;
            }
            if (b.equals(a)) {
              break;
            }
          }
        }
        if (ok) {
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
}

