package irvine.oeis.a035;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A035356 Number of asymmetric polygonal cacti with bridges (mixed Husimi trees).
 * @author Sean A. Irvine
 */
public class A035356 extends A035353 {

  private final A035354 mCSeq = new A035354();
  private final A035355 mDSeq = new A035355();
  private final Polynomial<Z> mD = RING.empty();

  @Override
  public Z next() {
    final Z b = super.next();
    final Z c = mCSeq.next();
    mD.add(mDSeq.next());
    return b.add(c).subtract(RING.multiply(mA, mD, mN).coeff(mN));
  }
}

