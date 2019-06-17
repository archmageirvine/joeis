package irvine.oeis.a023;

import java.util.Collections;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a065.A065099;
import irvine.oeis.a065.A065103;
import irvine.oeis.a213.A213256;

/**
 * A023922 Theta series of <code>A*_10</code> lattice.
 * @author Sean A. Irvine
 */
public class A023922 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Z Z22 = Z.valueOf(22);
  private static final Z Z308 = Z.valueOf(308);
  private static final Z Z880 = Z.valueOf(880);
  private final Sequence mASeq = new A065103();
  private final Sequence mBSeq = new A065099();
  private final Sequence mPSeq = new A213256();
  private final Polynomial<Z> mA = RING.create(Collections.emptyList());
  private final Polynomial<Z> mB = RING.create(Collections.emptyList());
  private final Polynomial<Z> mP = RING.create(Collections.emptyList());
  {
    mA.add(Z.ZERO);
    mB.add(Z.ZERO);
    mP.add(Z.ZERO);
  }
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mA.add(mASeq.next());
    mB.add(mBSeq.next());
    mP.add(mPSeq.next());
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta11 = RING.eta(RING.monomial(Z.ONE, 11), mN);
    final Polynomial<Z> etap11 = RING.pow(eta, 11, mN);

    final Polynomial<Z> e = RING.series(etap11, eta11, mN);

    final Polynomial<Z> c = RING.series(RING.multiply(RING.pow(eta11, 11, mN).shift(5), Z880), eta, mN);

    final Z p = RING.multiply(mP, etap11, mN).coeff(mN).multiply(Z.NINE);

    final Z a = mA.coeff(mN).multiply(Z308).add(mB.coeff(mN).multiply(Z22)).divide(3);

    return e.coeff(mN).add(c.coeff(mN)).subtract(p).add(a);
  }
}
