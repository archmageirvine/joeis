package irvine.oeis.a014;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A014563 a(n+1) is the smallest number &gt; a(n) such that the digits of a(n)^2 are all (with multiplicity) contained in the digits of a(n+1)^2, with a(0)=1.
 * @author Sean A. Irvine
 */
public class A014563 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final int[] syndrome = ZUtils.digitCounts(mA.square());
      do {
        mA = mA.add(1);
      } while (IntegerUtils.ltAny(ZUtils.digitCounts(mA.square()), syndrome));
    }
    return mA;
  }
}
