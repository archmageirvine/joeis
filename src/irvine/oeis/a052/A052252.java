package irvine.oeis.a052;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a051.A051573;

/**
 * A052252 Column 4 of A052250.
 * @author Sean A. Irvine
 */
public class A052252 extends AbstractSequence {

  /* Construct the sequence. */
  public A052252() {
    super(4);
  }

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);

  private final MemorySequence mB = MemorySequence.cachedSequence(new A051573());
  private final Polynomial<Z> mRow = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mRow.add(mB.next());
    return RING.pow(mRow, 4, ++mN).coeff(mN);
  }
}
