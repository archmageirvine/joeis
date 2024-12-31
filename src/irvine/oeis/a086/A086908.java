package irvine.oeis.a086;

import java.util.function.BiFunction;

import irvine.math.group.PolynomialRing;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001037;

/**
 * A086908 Let R be the polynomial ring GF(2)[x]. Then a(n) = number of distinct products f*g with f,g in R and 0 &lt;= deg(f),deg(g) &lt;= n.
 * @author Sean A. Irvine
 */
public class A086908 extends Sequence1 {

  // After Andrew Howroyd

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final DirectSequence mB = new A001037();
  private int mN = 0;

  private Z partitionProduct(final int[] p, final BiFunction<Integer, Integer, Z> f) {
    Z r = Z.ONE;
    int k = 0;
    for (int i = 1; i <= p.length; ++i) {
      if (i == p.length || p[i - 1] != p[i]) {
        r = r.multiply(f.apply(p[i - 1], i - k));
        k = i;
      }
    }
    return r;
  }

  private boolean ok(final int[] p, final int n, final int r) {
    Polynomial<Z> pol = RING.one();
    for (final int v : p) {
      pol = RING.multiply(pol, RING.onePlusXToTheN(v), n);
      if (pol.degree() >= r) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    Z s = Z.ONE.shiftLeft(++mN + 1);
    for (int r = 1; r <= mN; ++r) {
      final IntegerPartition part = new IntegerPartition(mN + r, mN);
      int[] p;
      while ((p = part.next()) != null) {
        if (ok(p, mN, r)) {
          s = s.add(partitionProduct(p, (t, e) -> Binomial.binomial(mB.a(t).add(e - 1), e)));
        }
      }
    }
    return s;
  }
}
