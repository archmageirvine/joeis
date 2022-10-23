package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014563 a(n+1) is the smallest number &gt; a(n) such that the digits of a(n)^2 are all (with multiplicity) contained in the digits of a(n+1)^2, with a(0)=1.
 * @author Sean A. Irvine
 */
public class A014563 extends Sequence0 {

  private Z mA = null;

  private int[] syndrome(Z square) {
    final int[] counts = new int[10];
    while (!square.isZero()) {
      ++counts[(int) square.mod(10)];
      square = square.divide(10);
    }
    return counts;
  }

  private boolean lt(final int[] a, final int[] b) {
    for (int k = 0; k < a.length; ++k) {
      if (a[k] < b[k]) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final int[] syndrome = syndrome(mA.square());
      do {
        mA = mA.add(1);
      } while (lt(syndrome(mA.square()), syndrome));
    }
    return mA;
  }
}
