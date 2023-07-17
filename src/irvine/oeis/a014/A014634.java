package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A014634 a(n) = (2*n+1)*(4*n+1).
 * @author Sean A. Irvine
 */
public class A014634 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A014634(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A014634() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(2 * ++mN + 1).multiply(4 * mN + 1);
  }
}
