package irvine.oeis.a027;

import java.util.Collection;
import java.util.TreeSet;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PartitionTransformSequence;

/**
 * A027582 Sequence satisfies T(T(a))=a, where T is defined below.
 * @author Sean A. Irvine
 */
public class A027582 extends MemorySequence {

  // WARNING: Do not use this implementation to extend the sequence without
  // careful checking.  I had a hard time getting this to work and it might
  // contain assumptions which are wrong.

  private static final int HEURISTIC_DISTANCE = 10;

  private int mT = 5;
  private final TreeSet<Integer> mC = new TreeSet<>();

  private Polynomial<Z> partitionTransform(final Collection<Z> a, final int n) {
    final TreeSet<Integer> c = new TreeSet<>();
    for (final Z u : a) {
      if (!u.isEven()) {
        c.add(u.intValueExact());
      }
    }
    return PartitionTransformSequence.partitionTransform(c, n);
  }

  protected Z select(final Z a, final Z b) {
    return a;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      mC.add(1);
      mC.add(3);
      return Z.ONE;
    }
    mC.add(mT);

    if (n >= mT - HEURISTIC_DISTANCE) {
      final Z t = Z.valueOf(mT);
      // Expand "b" series far enough to discover if t is present
      outer:
      for (int expand = mT; ; expand += 10) {
        final Polynomial<Z> a = PartitionTransformSequence.partitionTransform(mC, expand + HEURISTIC_DISTANCE);
        final Polynomial<Z> b = partitionTransform(a, expand);
        for (int k = 0; k <= b.degree(); ++k) {
          final int cmp = b.coeff(k).compareTo(t);
          if (cmp >= 0) {
            if (cmp > 0) {
              //System.out.println("Rejecting: " + mT + " " + b);
              mC.remove(mT); // Sequence cannot include "t"
            }
            break outer; // ok
          }
        }
      }
      mT += 2;
    }
    final Polynomial<Z> a0 = PartitionTransformSequence.partitionTransform(mC, mT);
    final Polynomial<Z> b0 = partitionTransform(a0, n);
    return select(a0.coeff(n), b0.coeff(n));
  }
}
