package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.UnimplementedException;

/**
 * A005873 Theta series of hexagonal close-packing with respect to tetrahedral hole.
 * @author Sean A. Irvine
 */
public class A005873 implements Sequence {

  // Formula (67) in Sloane paper, but does not seem to reproduce sequence

//  private static final QPolynomialRingField<Z> RING = new QPolynomialRingField<>(IntegerField.SINGLETON);
//  private static final Q SIX = new Q(6);
//  private static final Q EIGHT = new Q(8);
//  private static final Q ONE_TWELFTH = new Q(1, 12);
//  private static final Q FOUR_THIRDS = new Q(4, 3);
//  private static final Q SIXTEEN_THIRDS = new Q(16, 3);
//
//  private Q mN = ONE_TWELFTH.negate();

  @Override
  public Z next() {
//    mN = mN.add(ONE_TWELFTH);
//    final QPolynomial<Z> psi3 = ThetaFunctions.psi(Q.THREE, mN);
//    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(mN);
//    final QPolynomial<Z> a = RING.multiply(theta3.substitutePower(2), psi3.substitutePower(6), mN);
//
//    final QPolynomial<Z> psi6 = ThetaFunctions.psi(SIX, mN);
//    final QPolynomial<Z> theta2 = ThetaFunctions.theta2(mN);
//    final QPolynomial<Z> b = RING.multiply(theta2.substitutePower(2), psi6.substitutePower(6), mN);
//
//    final QPolynomial<Z> c = RING.add(a, b);
//    final QPolynomial<Z> psi8 = ThetaFunctions.psi(EIGHT, mN);
//    final QPolynomial<Z> d = RING.multiply(psi8.substitutePower(SIXTEEN_THIRDS), c, mN);
//    //System.out.println("d=" + d);
//
//    final QPolynomial<Z> g = RING.subtract(RING.divide(theta2.substitutePower(FOUR_THIRDS), Z.TWO), psi8.substitutePower(SIXTEEN_THIRDS));
//    //System.out.println("g=" + g);
//
//    final QPolynomial<Z> h = RING.multiply(theta2.substitutePower(2), theta2.substitutePower(6), mN);
//    final QPolynomial<Z> i = RING.multiply(theta3.substitutePower(2), theta3.substitutePower(6), mN);
//    final QPolynomial<Z> l = RING.add(h, i);
//    //System.out.println("l=" + l);
//    final QPolynomial<Z> j = RING.multiply(g, l, mN);
//    //System.out.println("j=" + j);
//
//    final QPolynomial<Z> m = RING.add(d, j);
//    //System.out.println("m=" + m);
//    return m.coeff(mN);
    throw new UnimplementedException();
  }
}
