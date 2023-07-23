package irvine.oeis.a063;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a058.A058870;

/**
 * A063688 Number of 2-trees rooted at a triangle.
 * @author Sean A. Irvine
 */
public class A063688 extends A063687 {

  {
    setOffset(1);
  }

  private static final CycleIndex Z3 = SymmetricGroup.create(3).cycleIndex();
  private int mN = -1;
  private final Polynomial<Z> mM = RING.empty();
  private final Sequence mXSeq = new A058870();
  private final Polynomial<Z> mX = RING.empty();

  @Override
  public Z next() {
    ++mN;
    mM.add(super.next());
    mX.add(mN > 0 ? mXSeq.next() : Z.ZERO);
    final Polynomial<Z> a = RING.add(mM, RING.multiply(mX, Z.TWO));
    final Polynomial<Z> b = RING.add(mM.substitutePower(2, mN), RING.multiply(mX.substitutePower(2, mN), Z.TWO));
    final Polynomial<Z> c = RING.multiply(b, mX, mN);
    return Z3.apply(PolynomialUtils.zToQ(a), mN).coeff(mN).toZ().subtract(c.coeff(mN));
  }
}

