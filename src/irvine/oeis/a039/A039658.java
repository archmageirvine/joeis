package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007317;
import irvine.oeis.memory.MemorySequence;

/**
 * A039658 Related to enumeration of edge-rooted catafusenes.
 * @author Sean A. Irvine
 */
public class A039658 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A039658(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A039658() {
    super(1);
  }

  private final MemorySequence mA = MemorySequence.cachedSequence(new A007317());
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 2; k <= mN; ++k) {
      sum = sum.add(mA.a((k - 2) / 2).multiply(mA.a((mN - k) / 2)));
    }
    return sum;
  }
}
