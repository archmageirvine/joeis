package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicIntArray;

/**
 * A031146 Exponent of the least power of 2 having exactly n zeros in its decimal representation.
 * @author Sean A. Irvine
 */
public class A031146 implements Sequence {

  private final DynamicIntArray mSmallest = new DynamicIntArray();
  private int mN = -1;
  private Z mA = null;
  private int mM = 0; // actually one larger than power of 2, as 0 is "unknown" in array

  protected long base() {
    return 2;
  }

  @Override
  public Z next() {
    ++mN;
    while (mSmallest.get(mN) == 0) {
      ++mM;
      mA = mA == null ? Z.ONE : mA.multiply(base());
      final int zeros = A031144.zeroCount(mA);
      if (mSmallest.get(zeros) == 0) {
        mSmallest.set(zeros, mM);
      }
    }
    return Z.valueOf(mSmallest.get(mN) - 1);
  }
}

