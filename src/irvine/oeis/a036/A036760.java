package irvine.oeis.a036;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A036760 Number of tree-like octagonal systems.
 * @author Sean A. Irvine
 */
public class A036760 extends A036759 {

  private static final Polynomial<Z> C1 = Polynomial.create(0, 2);
  private static final Polynomial<Z> C2 = Polynomial.create(2, -7);
  private static final Polynomial<Z> C3 = Polynomial.create(1, 7);
  private static final Polynomial<Z> C4 = Polynomial.create(4, -2);
  private static final Polynomial<Z> C5 = Polynomial.create(4, 4);
  private static final Polynomial<Z> C6 = Polynomial.create(0, 3);
  private static final Polynomial<Z> C7 = Polynomial.create(0, 2);
  private final A036758 mU = new A036758();

  @Override
  public Z next() {
    super.next(); // updates mV and mN
    mU.next(); // updates mG
    final Polynomial<Z> us2 = mU.mG.substitutePower(2, mN);
    final Polynomial<Z> gf = RING.add(RING.add(RING.add(RING.add(RING.subtract(RING.add(C1,
      RING.multiply(C2, mU.mG, mN)),
      RING.multiply(C3, RING.pow(mU.mG, 2, mN), mN)),
      RING.multiply(C4, mV, mN)),
      RING.multiply(C5, us2, mN)),
      RING.multiply(C6, RING.pow(us2, 2, mN), mN)),
      RING.multiply(C7, us2.substitutePower(2, mN), mN));
    return gf.coeff(mN).divide(8);
  }
}
