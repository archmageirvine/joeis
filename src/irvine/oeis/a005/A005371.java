package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005371 a(n) = L(L(n)), where L(n) are Lucas numbers A000032.
 * @author Sean A. Irvine
 */
public class A005371 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A005371(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A005371() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return Functions.LUCAS.z(Functions.LUCAS.z(++mN));
  }
}
