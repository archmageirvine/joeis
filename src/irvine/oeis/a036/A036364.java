package irvine.oeis.a036;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A036364 Number of free n-ominoes with cell centers determining n-2 space (proper dimension n-2).
 * @author Sean A. Irvine
 */
public class A036364 extends A000081 {

  /*
                                                                                  5                 2      2 2
          3             2          4         2    2         2 2        4    8 B(x)     8 (B(x) + B(x )) B(x )
    4 B(x)  + 4 B(x) B(x ) + 5 B(x)  + 2 B(x)  B(x ) + 7 B(x )  + 2 B(x ) + -------- + -----------------------
                                                                            1 - B(x)                 2
                                                                                              1 - B(x )
   */

  private final Polynomial<Z> mB = RING.empty();
  {
    for (int k = 0; k < 3; ++k) {
      mB.add(super.next());
    }
  }
  private int mN = 2;

  @Override
  public Z next() {
    mB.add(super.next());
    ++mN;
    final Polynomial<Z> b2 = mB.substitutePower(2, mN);
    final Polynomial<Z> b4 = mB.substitutePower(4, mN);
    final Polynomial<Z> b2p2 = RING.multiply(b2, b2, mN);
    final Polynomial<Z> bp2 = RING.multiply(mB, mB, mN);
    final Polynomial<Z> bp3 = RING.multiply(bp2, mB, mN);
    final Polynomial<Z> bp4 = RING.multiply(bp3, mB, mN);
    final Polynomial<Z> bp5 = RING.multiply(bp4, mB, mN);
    final Polynomial<Z> a = RING.series(RING.multiply(RING.multiply(RING.add(mB, b2), b2p2, mN), Z.EIGHT), RING.subtract(RING.one(), b2), mN);
    final Polynomial<Z> b = RING.series(RING.multiply(bp5, Z.EIGHT), RING.subtract(RING.one(), mB), mN);
    return bp3.coeff(mN).multiply(4)
      .add(RING.multiply(mB, b2, mN).coeff(mN).multiply(4))
      .add(bp4.coeff(mN).multiply(5))
      .add(RING.multiply(bp2, b2, mN).coeff(mN).multiply2())
      .add(b2p2.coeff(mN).multiply(7))
      .add(b4.coeff(mN).multiply2())
      .add(b.coeff(mN))
      .add(a.coeff(mN))
      .divide(8);
  }
}
