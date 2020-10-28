package irvine.oeis.a036;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A036367 Number of free orthoplex n-ominoes with cell centers determining n-2 space.
 * @author Sean A. Irvine
 */
public class A036367 extends A000081 {

  // todo is this formula actually correct? it doesn't seem to work

  /*
                                                5              2 2
       2      2  2        2 2        4    4 B(x)     4 B(x) B(x )
  (B(x)  + B(x ))  + 2 B(x )  + 2 B(x ) + -------- + -------------
                                          1 - B(x)            2
                                                       1 - B(x )
   */

  private final Polynomial<Z> mB = RING.empty();
  {
    for (int k = 0; k < 4; ++k) {
      mB.add(super.next());
    }
  }
  private int mN = 3;

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
    final Polynomial<Z> a = RING.series(RING.multiply(RING.multiply(mB, b2p2, mN), Z.FOUR), RING.subtract(RING.one(), b2), mN);
    final Polynomial<Z> b = RING.series(RING.multiply(bp5, Z.FOUR), RING.subtract(RING.one(), mB), mN);
    return RING.pow(RING.add(bp2, b2), 2, mN).coeff(mN)
      .add(b2p2.coeff(mN).multiply2())
      .add(b4.coeff(mN).multiply2())
      .add(b.coeff(mN))
      .add(a.coeff(mN))
      .divide(8);
  }
}
