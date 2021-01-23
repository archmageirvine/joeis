package irvine.oeis.a294;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a003.A003168;
import irvine.oeis.a003.A003169;

/**
 * A294724 Number of Q graphs with 2*n vertices rooted at an internal edge.
 * @author Sean A. Irvine
 */
public class A294724 extends A003168 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final A003169 mSeqP = new A003169();
  private Polynomial<Z> mP = RING.zero();
  private Polynomial<Z> mB = Polynomial.create(0, -1);
  private int mN = 0;


  @Override
  public Z next() {
    mN += 2;
    mB = RING.add(mB, RING.monomial(super.next(), mN - 1));
    mP = RING.add(mP, RING.monomial(mSeqP.next(), mN));
    return RING.multiply(RING.pow(mB, 2, mN), mP, mN).coeff(mN);
  }
}
