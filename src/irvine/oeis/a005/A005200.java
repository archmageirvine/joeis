package irvine.oeis.a005;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000081;

/**
 * A005200 Total number of fixed points in rooted trees with n nodes.
 * @author Sean A. Irvine
 */
public class A005200 extends MemorySequence {

  {
    add(Z.ZERO); // Start sequence from 1
  }

  private final Sequence mA81 = new A000081();
  protected final List<Z> mT = new ArrayList<>();

  Z getT(final int i) {
    if (i < 0) {
      return Z.ZERO;
    }
    while (i >= mT.size()) {
      mT.add(mA81.next());
    }
    return mT.get(i);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    Z sum = getT(n);
    for (int k = 0; k < n; ++k) {
      sum = sum.add(getT(n - k).subtract(getT(n - 2 * k)).multiply(get(k)));
    }
    return sum;
  }

}
