package irvine.oeis.a035;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A035085 Number of polygonal cacti (Husimi graphs) with n nodes.
 * @author Sean A. Irvine
 */
public class A035085 extends A035083 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private final A035082 mBSeq = new A035082();
  private final A035084 mDSeq = new A035084();
  private final Polynomial<Z> mD = RING.empty();
  private final Polynomial<Z> mB = RING.empty();

  @Override
  public Z next() {
    final Z c = super.next();
    final Z b = mBSeq.next();
    mB.add(b);
    mD.add(mDSeq.next());
    return ++mN == 0 ? Z.ONE : b.add(c).subtract(RING.multiply(mB, mD, mN).coeff(mN));
  }
}
