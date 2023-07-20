package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A030193 Let S = squares; a(0)=0; a(n) = smallest m such that m - a(i) is not in S for any i &lt; n.
 * @author Sean A. Irvine
 */
public class A030193 extends MemorySequence {

  private boolean isSquareDifference(final Z m) {
    for (final Z a : this) {
      if (m.subtract(a).isSquare()) {
        return true;
      }
    }
    return false;
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ZERO;
    }
    Z m = a(size() - 1);
    do {
      m = m.add(1);
    } while (isSquareDifference(m));
    return m;
  }
}
