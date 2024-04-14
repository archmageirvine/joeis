package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066825 a(1) = 1; set of digits of a(n)^2 is a subset of the set of digits of a(n+1)^2.
 * @author Sean A. Irvine
 */
public class A066825 extends Sequence1 {

  private Z mA = null;

  private boolean le(final int[] a, final int[] b) {
    for (int k = 0; k < a.length; ++k) {
      if (a[k] > b[k]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final int syn = Functions.SYNDROME.i(mA.square());
      while (true) {
        mA = mA.add(1);
        final int s = Functions.SYNDROME.i(mA.square());
        if ((s & syn) == syn) {
          break;
        }
      }
    }
    return mA;
  }
}
