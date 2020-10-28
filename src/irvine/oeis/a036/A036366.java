package irvine.oeis.a036;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a004.A004111;

/**
 * A036366 Number of asymmetric n-ominoes in n-2 space.
 * @author Sean A. Irvine
 */
public class A036366 extends A004111 {

  /*
                                                                                 5                 2      2 2
         3             2          4         2    2         2 2        4    8 A(x)     8 (A(x) + A(x )) A(x )
   4 A(x)  - 4 A(x) A(x ) + 5 A(x)  - 2 A(x)  A(x ) - 5 A(x )  + 2 A(x ) + -------- - -----------------------
                                                                           1 - A(x)               2
                                                                                           1 - A(x )
   */

  private final Polynomial<Z> mA = RING.empty();
  {
    for (int k = 0; k < 3; ++k) {
      mA.add(super.next());
    }
  }
  private int mN = 2;

  @Override
  public Z next() {
    mA.add(super.next());
    ++mN;
    final Polynomial<Z> a2 = mA.substitutePower(2, mN);
    final Polynomial<Z> a4 = mA.substitutePower(4, mN);
    final Polynomial<Z> a2p2 = RING.multiply(a2, a2, mN);
    final Polynomial<Z> ap2 = RING.multiply(mA, mA, mN);
    final Polynomial<Z> ap3 = RING.multiply(ap2, mA, mN);
    final Polynomial<Z> ap4 = RING.multiply(ap3, mA, mN);
    final Polynomial<Z> ap5 = RING.multiply(ap4, mA, mN);
    final Polynomial<Z> a = RING.series(RING.multiply(RING.multiply(RING.add(mA, a2), a2p2, mN), Z.EIGHT), RING.subtract(RING.one(), a2), mN);
    final Polynomial<Z> b = RING.series(RING.multiply(ap5, Z.EIGHT), RING.subtract(RING.one(), mA), mN);
    return ap3.coeff(mN).multiply(4)
      .subtract(RING.multiply(mA, a2, mN).coeff(mN).multiply(4))
      .add(ap4.coeff(mN).multiply(5))
      .subtract(RING.multiply(ap2, a2, mN).coeff(mN).multiply2())
      .subtract(a2p2.coeff(mN).multiply(5))
      .add(a4.coeff(mN).multiply2())
      .add(b.coeff(mN))
      .subtract(a.coeff(mN))
      .divide(8);
  }
}
