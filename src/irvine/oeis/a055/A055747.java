package irvine.oeis.a055;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.ZeroSpacedSequence;
import irvine.oeis.a003.A003783;
import irvine.oeis.a004.A004009;

/**
 * A055747 Expansion of Jacobi form of weight 12 and index 1 for the Niemeier lattice of type E_8^3 or D_16+E_8.
 * @author Sean A. Irvine
 */
public class A055747 extends A003783 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Sequence mASeq = new ZeroSpacedSequence(new A004009(), 3);
  private final Polynomial<Z> mE8 = RING.empty();
  private final Polynomial<Z> mE4 = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mE4.add(super.next());
    mE8.add(mASeq.next());
    return RING.multiply(mE4, mE8, mN).coeff(mN);
  }
}
