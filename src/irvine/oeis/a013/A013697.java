package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A013697 Second term in continued fraction for zeta(n).
 * @author Sean A. Irvine
 */
public class A013697 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A013697(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A013697() {
    super(2);
  }

  private int mN = 1;

  @Override
  public Z next() {
    return Zeta.zeta(++mN).subtract(CR.ONE).inverse().floor();
  }
}
