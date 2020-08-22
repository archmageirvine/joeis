package irvine.oeis.a006;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a002.A002129;

/**
 * A006950 G.f.: Product_{k&gt;=1} (1 + x^(2*k - 1)) / (1 - x^(2*k)).
 * @author Sean A. Irvine
 */
public class A006950 extends MemorySequence {

  private final List<Z> mA2129 = new ArrayList<>();
  private final A002129 mSeq = new A002129();

  private Z a2129(final int n) {
    while (n > mA2129.size()) {
      mA2129.add(mSeq.next());
    }
    return mA2129.get(n - 1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      sum = sum.signedAdd((k & 1) != 0, get(n - k).multiply(a2129(k)));
    }
    return sum.divide(n);
  }
}
