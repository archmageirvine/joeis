package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A001045 Jacobsthal sequence (or Jacobsthal numbers): a(n) = a(n-1) + 2*a(n-2), with a(0) = 0, a(1) = 1; also a(n) = nearest integer to 2^n/3.
 * @author Sean A. Irvine
 */
public class A001045 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001045(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001045() {
    super(0);
  }

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ZERO;
    }
    if (mB == null) {
      mB = Z.ONE;
      return Z.ONE;
    }
    final Z t = mB.add(mA.multiply2());
    mA = mB;
    mB = t;
    return t;
  }

  @Override
  public Z a(final Z n) {
    return Functions.JACOBSTHAL.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.JACOBSTHAL.z(n);
  }
}
