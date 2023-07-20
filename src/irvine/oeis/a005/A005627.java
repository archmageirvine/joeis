package irvine.oeis.a005;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a000.A000625;

/**
 * A005627 Number of achiral planted trees with n nodes.
 * @author Sean A. Irvine
 */
public class A005627 extends MemorySequence {

  private final A000625 mA625 = new A000625();
  private final ArrayList<Z> mS = new ArrayList<>();

  protected Z getS(final int n) {
    while (n >= mS.size()) {
      mS.add(mA625.next());
    }
    return mS.get(n);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= (n - 1) / 2; ++k) {
      sum = sum.add(getS(k).multiply(a(n - 2 * k - 1)));
    }
    return sum;
  }
}


