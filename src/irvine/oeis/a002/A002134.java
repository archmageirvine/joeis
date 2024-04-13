package irvine.oeis.a002;

import java.util.HashSet;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.Triple;

/**
 * A002134 Generalized divisor function. Number of partitions of n with exactly three part sizes.
 * @author Sean A. Irvine
 */
public class A002134 extends AbstractSequence {

  /** Construct the sequence. */
  public A002134() {
    super(6);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 5;

  private int[] threeParts(final int[] c) {
    final int[] m = new int[3];
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
    return mp == 2 ? m : null;
  }

  private Polynomial<Z> t3(final int n, final int m1, final int m2, final int m3) {
    final Polynomial<Z> num = RING.monomial(Z.ONE, m1 + m2 + m3);
    final Polynomial<Z> den = RING.multiply(RING.multiply(RING.oneMinusXToTheN(m1), RING.oneMinusXToTheN(m2), n), RING.oneMinusXToTheN(m3), n);
    return RING.series(num, den, n);
  }

  private Polynomial<Z> t3(final int u) {
    final HashSet<Triple<Integer>> seen = new HashSet<>();
    Polynomial<Z> sum = RING.zero();
    for (int n = 6; n <= u; ++n) {
      final int[] counts = new int[n + 1];
      final IntegerPartition ip = new IntegerPartition(n);
      int[] p;
      while ((p = ip.next()) != null) {
        IntegerPartition.toCountForm(p, counts);
        final int[] m = threeParts(counts);
        if (m != null && seen.add(new Triple<>(m[0], m[1], m[2]))) {
          sum = RING.add(sum, t3(u, m[0], m[1], m[2]));
        }
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    return t3(++mN + 1).coeff(mN);
  }
}
