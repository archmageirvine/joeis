package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a002.A002024;

/**
 * A005230.
 * @author Sean A. Irvine
 */
public class A005230 extends MemorySequence {

  private final A002024 mLim = new A002024();

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final int l = mLim.next().intValue();
    for (int k = 1; k <= l; ++k) {
      sum = sum.add(get(n - k));
    }
    return sum;
  }
}

