package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000214 Number of equivalence classes of Boolean functions of n variables under action of AG(n,2).
 * @author Sean A. Irvine
 */
public class A000214 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000214(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000214() {
    super(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return AffineGroupCycleIndex.cycleIndex(++mN).apply(1).toZ();
  }
}
