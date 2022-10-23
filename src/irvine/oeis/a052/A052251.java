package irvine.oeis.a052;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence3;
import irvine.oeis.a051.A051573;

/**
 * A052251 Column 3 of A052250.
 * @author Sean A. Irvine
 */
public class A052251 extends Sequence3 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);

  private final MemorySequence mB = MemorySequence.cachedSequence(new A051573());
  private final Polynomial<Z> mRow = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mRow.add(mB.next());
    return RING.pow(mRow, 3, ++mN).coeff(mN);
  }
}
