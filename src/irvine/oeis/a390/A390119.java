package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390119 allocated for Taylor McAdam.
 * @author Sean A. Irvine
 */
public class A390119 extends Sequence1 {

  // After Kevin Ryde

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    long h = mN >>> 1;
    return new Z(Long.toBinaryString(Functions.MAKE_ODD.l(h)), 3).multiply2().subtract(1 - (mN & 1));
  }
}
