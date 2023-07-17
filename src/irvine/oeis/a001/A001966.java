package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001966 v-pile counts for the 4-Wythoff game with i=2.
 * @author Sean A. Irvine
 */
public class A001966 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001966(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001966() {
    super(0);
  }

  private static final CR N = CR.FIVE.sqrt().add(CR.THREE);
  private long mN = -1;

  @Override
  public Z next() {
    return N.multiply(CR.valueOf(++mN).add(CR.HALF)).floor();
  }
}
