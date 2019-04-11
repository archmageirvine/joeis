package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001144 An exponential function on partitions (next term is <code>2^512)</code>.
 * @author Sean A. Irvine
 */
public class A001144 implements Sequence {

  private static final int[] SMALL = {1, 2, 3, 4, 9, 27};

  private Z mA = null;
  private Z mB = null;
  private int mN = -1;

  @Override
  public Z next() {
    final Z r;
    if (++mN < SMALL.length) {
      r = Z.valueOf(SMALL[mN]);
    } else {
      r = Z.ONE.shiftLeft(mA.intValueExact());
    }
    mA = mB;
    mB = r;
    return r;
  }
}
