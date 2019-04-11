package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007166 Number of blobs with <code>2n+1</code> edges.
 * @author Sean A. Irvine
 */
public class A007166 implements Sequence {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mS = RING.zero();
  private int mN = 0;

  protected Z select(final Polynomial<Z> s, final Polynomial<Z> b, final int n) {
    return b.coeff(2 * n - 1);
  }

  @Override
  public Z next() {
    ++mN;
    final int n = 2 * mN;
    Polynomial<Z> p = RING.one();
    for (int i = 1; i < n; i += 2) {
      p = RING.multiply(p, RING.pow(RING.oneMinusXToTheN(i), mS.coeff(i), n));
    }
    p = RING.series(RING.one(), p, n);
    final Z[] coeff = new Z[n];
    Arrays.fill(coeff, Z.ZERO);
    coeff[0] = Z.ZERO;
    coeff[1] = Z.ONE;
    for (int k = 0; k < n; ++k) {
      coeff[k] = coeff[k].subtract(mS.coeff(k));
      if ((k & 1) == 1) {
        coeff[k] = coeff[k].add(p.coeff(k));
      }
    }
    final Polynomial<Z> b = RING.create(Arrays.asList(coeff));
    mS = RING.add(RING.x(), RING.series(RING.pow(b, 3, n), RING.subtract(RING.one(), RING.pow(b, 2, n)), n));
    return select(mS, b, mN);
  }
}
