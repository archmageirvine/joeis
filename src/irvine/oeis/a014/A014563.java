package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014563 <code>a(n+1)</code> is the smallest number <code>&gt; a(n)</code> such that the digits of <code>a(n)^2</code> are all (with multiplicity) contained in the digits of <code>a(n+1)^2,</code> with <code>a(0)=1</code>.
 * @author Sean A. Irvine
 */
public class A014563 implements Sequence {

  private Z mA = null;

  private int[] syndrome(Z square) {
    final int[] counts = new int[10];
    while (!Z.ZERO.equals(square)) {
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
