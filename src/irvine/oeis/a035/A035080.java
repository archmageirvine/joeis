package irvine.oeis.a035;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007561;

/**
 * A035080 Number of asymmetric connected graphs where every block is a complete graph.
 * @author Sean A. Irvine
 */
public class A035080 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private final Sequence mCSeq = new A035079();
  private final Sequence mBSeq = new A007561();
  private final Polynomial<Z> mC = RING.empty();
  private final Polynomial<Z> mB = RING.empty();

  @Override
  public Z next() {
    ++mN;
    mC.add(mCSeq.next());
    mB.add(mBSeq.next());
    return mB.coeff(mN).add(mC.coeff(mN)).subtract(RING.multiply(mB, mC, mN).coeff(mN));
  }
}
