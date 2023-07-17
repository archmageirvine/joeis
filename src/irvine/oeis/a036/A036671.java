package irvine.oeis.a036;

import irvine.math.group.DihedralGroup;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000598;

/**
 * A036671 Number of isomers C_n H_{2n} without double bonds.
 * @author Sean A. Irvine
 */
public class A036671 extends A000598 {

  /** Construct the sequence. */
  public A036671() {
    super(1);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mG = RING.empty();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mG.add(new Q(super.next()));
    final Polynomial<Q> g = RING.divide(RING.add(RING.pow(mG, 2, mN), mG.substitutePower(2, mN)).shift(1), Q.TWO);
    Polynomial<Q> sum = RING.zero();
    for (int k = 3; k <= mN; ++k) {
      sum = RING.add(sum, DihedralGroup.cycleIndex(k).apply(g, mN));
    }
    return sum.coeff(mN).toZ();
  }
}
