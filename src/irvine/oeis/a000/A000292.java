package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000292 Tetrahedral (or triangular pyramidal) numbers: a(n) = C(n+2,3) = n*(n+1)*(n+2)/6.
 * @author Sean A. Irvine
 */
public class A000292 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000292(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000292() {
    super(0);
  }

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Functions.TETRAHEDRAL.z(mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.TETRAHEDRAL.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.TETRAHEDRAL.z(n);
  }
}
