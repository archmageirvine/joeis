package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a050.A050383;

/**
 * A052853 A simple grammar.
 * @author Sean A. Irvine
 */
public class A052853 extends A050383 {

  /** Construct the sequence. */
  public A052853() {
    super(0);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mC = RING.empty();

  {
    mC.add(Q.ZERO);
  }

  @Override
  public Z next() {
    mC.add(new Q(super.next().negate()));
    Q sum = Q.ZERO;
    for (int j = 1; j <= mN; ++j) {
      sum = sum.add(RING.log1p(mC.substitutePower(j, mN), mN).coeff(mN).multiply(new Q(Euler.phiAsLong(j), j)));
    }
    return sum.negate().toZ();
  }
}
