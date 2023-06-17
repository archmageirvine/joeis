package irvine.oeis.a013;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000521;
import irvine.oeis.a054.A054891;

/**
 * A013975 Modular form of level 4 and weight 1/2.
 * @author Sean A. Irvine
 */
public class A013975 extends AbstractSequence {

  /** Construct the sequence. */
  public A013975() {
    super(-4);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X4 = RING.monomial(Z.ONE, 4);
  private static final Polynomial<Z> C = Polynomial.create(852);
  private final ArrayList<Z> mE6 = new ArrayList<>();
  private int mN = -1;

  private final A000521 mJSeq = new A000521();

  {
    mJSeq.next(); // skip -1th term
  }
  private final ArrayList<Z> mJ = new ArrayList<>();

  @Override
  public Z next() {
    ++mN;
    final FactorSequence fs = Jaguar.factor(mN);
    mE6.add(mN == 0 ? Z.ONE : fs.sigma(5).multiply(-504));
    mJ.add(mJSeq.next());
    if (mN < 2) {
      return Z.valueOf(1 - mN);
    }
    final Polynomial<Z> e6z4 = RING.create(mE6).substitutePower(4, mN);
    final Polynomial<Z> kz2 = RING.multiply(A054891.kz(mN), Z.TWO);
    final Polynomial<Z> del12 = RING.pow(RING.eta(X4, mN), 24, mN);
    final Polynomial<Z> b = RING.series(RING.multiply(kz2, e6z4, mN), del12, mN);
    final Polynomial<Z> j = RING.subtract(RING.create(mJ).substitutePower(4, mN), C);
    final Polynomial<Z> t = ThetaFunctions.theta3z(mN);
    final Polynomial<Z> j4 = t.shift(-4); // Handle contribution from j^(-4) in expansion of j
    final Polynomial<Z> a = RING.add(RING.multiply(j, t), j4);
    return (mN >= 4 ? a.coeff(mN - 4) : Z.ZERO).subtract(b.coeff(mN));
  }
}
