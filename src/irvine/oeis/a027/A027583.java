package irvine.oeis.a027;

import java.util.Collection;
import java.util.TreeSet;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.PartitionTransformSequence;
import irvine.oeis.Sequence;

/**
 * A027583 Sequence satisfies T(a)=a, where T is defined below.
 * @author Sean A. Irvine
 */
public class A027583 implements Sequence {

  // After Robert Israel

  private Polynomial<Z> mA = Polynomial.create(0, 1, 1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 9, 10, 11, 13, 16);
  private int mN = 0;

  private Polynomial<Z> partitionTransform(final Collection<Z> a, final int n) {
    final TreeSet<Integer> c = new TreeSet<>();
    for (final Z u : a) {
      final long r = u.mod(5);
      if (r == 1 || r == 4) {
        c.add(u.intValueExact());
      }
    }
    return PartitionTransformSequence.partitionTransform(c, n);
  }

  @Override
  public Z next() {
    if (++mN > mA.degree()) {
      mA = partitionTransform(mA, mN);
    }
    return mA.coeff(mN);
  }
}
