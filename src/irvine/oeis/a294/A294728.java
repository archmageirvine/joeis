package irvine.oeis.a294;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a003.A003168;
import irvine.oeis.a007.A007165;

/**
 * A294728 Number of Q graphs with 2*n vertices symmetrical about a distinguished edge.
 * @author Sean A. Irvine
 */
public class A294728 extends A003168 {

  /** Construct the sequence. */
  public A294728() {
    super(1);
  }

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final A007165 mSeqH = new A007165();
  private Polynomial<Z> mH = RING.zero();
  private Polynomial<Z> mB = Polynomial.create(0, -1);
  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    mB = RING.add(mB, RING.monomial(super.next(), mN - 1));
    mH = RING.add(mH, RING.monomial(mSeqH.next(), mN));
    return RING.multiply(mB.substitutePower(2, mN), mH, mN).coeff(mN);
  }
}
