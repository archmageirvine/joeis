package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000244 Powers of 3: a(n) = 3^n.
 * @author Sean A. Irvine
 */
public class A000244 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000244(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000244() {
    super(0);
  }

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.multiply(3);
    }
    return mA;
  }

  @Override
  public Z a(final Z n) {
    return Z.THREE.pow(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    return Z.THREE.pow(n);
  }

}

