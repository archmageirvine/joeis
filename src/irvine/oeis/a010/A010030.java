package irvine.oeis.a010;

import java.util.Arrays;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A010030 Irregular triangle read by rows: T(n,k) (n &gt;= 1, 0 &lt;= k &lt;= [n/2]) =  number of permutations of 1..n with [n/2]-k runs of consecutive pairs up and down (divided by 2).
 * @author Sean A. Irvine
 */
public class A010030 extends Sequence1 {

  private static final PolynomialRingField<Z> Y_RING = new PolynomialRingField<>("y", IntegerField.SINGLETON);
  private static final Polynomial<Z> Y0N = Y_RING.negate(Y_RING.one());
  private static final Polynomial<Z> Y1 = Y_RING.oneMinusXToTheN(1);
  private static final Polynomial<Z> Y1A = Y_RING.negate(Y1);
  private static final Polynomial<Z> Y1B = Y_RING.multiply(Y1, Z.TWO);
  private static final PolynomialRingField<Polynomial<Z>> X_RING = new PolynomialRingField<>(Y_RING);

  private Polynomial<Polynomial<Z>> mGf = null;
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      if (++mN == 1) {
        return Z.ONE;
      }
      mM = mN / 2;
      mGf = X_RING.zero();
      Z mF = Z.ONE;
      for (int k = 0; k <= mN; ++k) {
        if (k > 1) {
          mF = mF.multiply(k);
        }
        final Polynomial<Polynomial<Z>> num = X_RING.create(Arrays.asList(Y_RING.zero(), Y0N, Y1B, Y1A));
        final Polynomial<Polynomial<Z>> den = X_RING.create(Arrays.asList(Y0N, Y_RING.zero(), Y1));
        mGf = X_RING.add(mGf, X_RING.multiply(X_RING.pow(X_RING.series(num, den, mN), k, mN), Y_RING.monomial(mF, 0)));
      }

    }
    return mGf.coeff(mN).coeff(mM).divide2();
  }
}
