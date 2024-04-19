package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.DynamicIntArray;

/**
 * A031146 Exponent of the least power of 2 having exactly n zeros in its decimal representation.
 * @author Sean A. Irvine
 */
public class A031146 extends AbstractSequence {

  private final DynamicIntArray mSmallest = new DynamicIntArray();
  private int mN = -1;
  private Z mA = null;
  private int mM = 0; // actually one larger than power of 2, as 0 is "unknown" in array
  private final int mBase; // number base

  /** Construct the sequence. */
  public A031146() {
    this(0, 2, 0);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param parm1 base
   * @param parm2 desired digits
   */
  public A031146(final int offset, final int parm1, final int parm2) {
    super(offset);
    mBase = parm1;
  }

  @Override
  public Z next() {
    ++mN;
    while (mSmallest.get(mN) == 0) {
      ++mM;
      mA = mA == null ? Z.ONE : mA.multiply(mBase);
      final int zeros = A031144.zeroCount(mA);
      if (mSmallest.get(zeros) == 0) {
        mSmallest.set(zeros, mM);
      }
    }
    return Z.valueOf(mSmallest.get(mN) - 1);
  }
}

