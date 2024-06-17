package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000384 Hexagonal numbers: a(n) = n*(2*n-1).
 * @author Sean A. Irvine
 */
public class A000384 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000384(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000384() {
    super(0);
  }

  protected Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Functions.HEXAGONAL.z(mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.HEXAGONAL.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.HEXAGONAL.z(n);
  }
}
