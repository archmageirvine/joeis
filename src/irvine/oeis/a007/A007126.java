package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000088;
import irvine.oeis.a002.A002854;

/**
 * A007126 Number of connected rooted strength 1 Eulerian graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A007126 extends MemorySequence {

  {
    setOffset(1);
  }

  private final Sequence mA88 = new A000088();
  private final Sequence mA2854 = new A002854();
  private final ArrayList<Z> mT = new ArrayList<>();

  private Z t(final int n) {
    while (n >= mT.size()) {
      mT.add(mA2854.next());
    }
    return mT.get(n - 1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    Z sum = mA88.next();
    for (int k = 0; k < n; ++k) {
      sum = sum.subtract(get(k).multiply(t(n - k)));
    }
    return sum;
  }
}
