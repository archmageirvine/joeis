package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000295 Eulerian numbers (Euler's triangle: column k=2 of A008292, column k=1 of A173018).
 * @author Sean A. Irvine
 */
public class A000295 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000295(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000295() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).subtract(mN + 1);
  }
}
