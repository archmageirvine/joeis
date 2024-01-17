package irvine.oeis.a067;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A067971 a(n+1) is the smallest number &gt; a(n) such that the digits of a(n)^3 are all (with multiplicity) properly contained in the digits of a(n+1)^3, with a(0)=1.
 * @author Sean A. Irvine
 */
public class A067971 extends Sequence0 {

  private Z mA = null;

  protected boolean lt(final int[] a, final int[] b) {
    for (int k = 0; k < a.length; ++k) {
      if (a[k] > b[k]) {
        return false;
      }
    }
    return !Arrays.equals(a, b);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final int[] cnts = ZUtils.digitCounts(mA.pow(3));
    while (true) {
      mA = mA.add(1);
      if (lt(cnts, ZUtils.digitCounts(mA.pow(3)))) {
        return mA;
      }
    }
  }
}
