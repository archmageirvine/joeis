package irvine.oeis.a035;

import java.util.Collections;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a007.A007563;

/**
 * A035053 Number of connected graphs on n unlabeled nodes where every block is a complete graph.
 * @author Sean A. Irvine
 */
public class A035053 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private final Sequence mCSeq = new A035052().skip(1);
  private final Sequence mBSeq = new A007563().skip(1);
  private final Polynomial<Z> mC = RING.empty();
  private final Polynomial<Z> mB = RING.create(Collections.singletonList(Z.ONE));
  {
    mC.add(Z.ZERO);
  }


  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mC.add(mCSeq.next());
    mB.add(mBSeq.next().negate());
    return RING.multiply(mB, mC, mN).coeff(mN);
  }
}
