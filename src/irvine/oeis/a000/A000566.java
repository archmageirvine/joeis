package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000566 Heptagonal numbers (or 7-gonal numbers): n*(5*n-3)/2.
 * @author Sean A. Irvine
 */
public class A000566 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000566(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000566() {
    super(0);
  }

  protected Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(5).subtract(3).multiply(mN).divide2();
  }
}

