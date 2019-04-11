package irvine.oeis.a010;

import java.util.Arrays;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010029 Irregular triangle read by rows: T(n,k) <code>(n&gt;=1, 0 &lt;= k &lt;= floor(n/2)) =</code> number of permutations of <code>1..n</code> with exactly <code>floor(n/2) - k</code> runs of consecutive pairs up.
 * @author Sean A. Irvine
 */
public class A010029 implements Sequence {

  private static final PolynomialRingField<Z> Y_RING = new PolynomialRingField<>("y", IntegerField.SINGLETON);
  private static final Polynomial<Z> Y0N = Y_RING.negate(Y_RING.one());
  private static final Polynomial<Z> Y1 = Y_RING.oneMinusXToTheN(1);
  private static final PolynomialRingField<Polynomial<Z>> X_RING = new PolynomialRingField<>(Y_RING);

  private Polynomial<Polynomial<Z>> mGf = null;
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      ++mN;
      mM = mN / 2;
      mGf = X_RING.zero();
      Z mF = Z.ONE;
      for (int k = 0; k <= mN; ++k) {
        if (k > 1) {
          mF = mF.multiply(k);
        }
        final Polynomial<Polynomial<Z>> num = X_RING.create(Arrays.asList(Y_RING.zero(), Y0N, Y1));
        final Polynomial<Polynomial<Z>> den = X_RING.create(Arrays.asList(Y0N, Y_RING.zero(), Y1));
        mGf = X_RING.add(mGf, X_RING.multiply(X_RING.pow(X_RING.series(num, den, mN), k, mN), Y_RING.monomial(mF, 0)));
      }

    }
    return mGf.coeff(mN).coeff(mM);
  }
}
