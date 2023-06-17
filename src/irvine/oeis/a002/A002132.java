package irvine.oeis.a002;

import java.util.HashSet;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.Point;

/**
 * A002132 Generalized sum of divisors function.
 * @author Sean A. Irvine
 */
public class A002132 extends AbstractSequence {

  /** Construct the sequence. */
  public A002132() {
    super(4);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 3;

  private int[] twoParts(final int[] c) {
    final int[] m = new int[2];
    int mp = -1;
    for (int k = 1; k < c.length; ++k) {
      final int v = c[k];
      if (v != 0) {
        if (++mp == m.length) {
          return null;
        }
        m[mp] = k;
      }
    }
    return mp == 1 ? m : null;
  }

  private Polynomial<Z> t2(final int n, final int m1, final int m2) {
    final Polynomial<Z> num = RING.monomial(Z.ONE, 2 * (m1 + m2 - 1));
    final Polynomial<Z> den = RING.multiply(RING.oneMinusXToTheN(2 * m1 - 1), RING.oneMinusXToTheN(2 * m2 - 1), n);
    return RING.series(num, RING.pow(den, 2, n), n);
  }

  private Polynomial<Z> t2(final int u) {
    final HashSet<Point> seen = new HashSet<>();
    Polynomial<Z> sum = RING.zero();
    for (int n = 4; n <= u; ++n) {
      final int[] counts = new int[n + 1];
      final IntegerPartition ip = new IntegerPartition(n);
      int[] p;
      while ((p = ip.next()) != null) {
        IntegerPartition.toCountForm(p, counts);
        final int[] m = twoParts(counts);
        if (m != null && seen.add(new Point(m[0], m[1]))) {
          sum = RING.add(sum, t2(u, m[0], m[1]));
        }
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    return t2(++mN + 1).coeff(mN);
  }
}
