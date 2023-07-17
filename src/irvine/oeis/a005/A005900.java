package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005900 Octahedral numbers: a(n) = n*(2*n^2 + 1)/3.
 * @author Sean A. Irvine
 */
public class A005900 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A005900(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A005900() {
    super(0);
  }

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(3).multiply2().add(mN).divide(3);
  }
}
