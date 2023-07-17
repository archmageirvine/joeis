package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000149 a(n) = floor(e^n).
 * @author Sean A. Irvine
 */
public class A000149 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000149(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000149() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(++mN).exp().floor();
  }
}
