package irvine.oeis.a004;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a033.A033762;

/**
 * A004046 Theta series of extremal 3-modular even 24-dimensional lattice with minimal norm 6 and det <code>= 3^12</code>.
 * @author Sean A. Irvine
 */
public class A004046 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private final Sequence mPhi0 = new A004016();
  private final Sequence mPhi1 = new A033762();
  private final ArrayList<Z> mSeqPhi0 = new ArrayList<>();
  private final ArrayList<Z> mSeqPhi1 = new ArrayList<>();
  private int mN = -2;

  @Override
  public Z next() {
    mSeqPhi0.add(mPhi0.next());
    mSeqPhi1.add(mPhi1.next());
    final Polynomial<Z> phi0 = RING.create(mSeqPhi0).substitutePower(4);
    final Polynomial<Z> phi1 = RING.multiply(RING.create(mSeqPhi1).substitutePower(2).shift(1), Z.TWO);
    mN += 2;
    final Polynomial<Z> c = RING.pow(phi0, 12, mN);
    final Polynomial<Z> d = RING.multiply(RING.pow(phi0, 8, mN), RING.pow(phi1, 4, mN), mN);
    final Polynomial<Z> e = RING.multiply(RING.pow(phi0, 6, mN), RING.pow(phi1, 6, mN), mN);
    final Polynomial<Z> f = RING.multiply(RING.pow(phi0, 4, mN), RING.pow(phi1, 8, mN), mN);
    final Polynomial<Z> g = RING.multiply(RING.pow(phi0, 2, mN), RING.pow(phi1, 10, mN), mN);
    final Polynomial<Z> h = RING.pow(phi1, 12, mN);

    return c.coeff(mN).multiply2()
      .subtract(d.coeff(mN).multiply(9))
      .add(e.coeff(mN).multiply(828))
      .add(f.coeff(mN).multiply(2916))
      .add(g.coeff(mN).multiply(3996))
      .add(h.coeff(mN).multiply(459))
      .divide2();
  }
}
