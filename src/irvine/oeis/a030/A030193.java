package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A030193 Let S = squares; <code>a(0)=0; a(n) =</code> smallest m such that m <code>- a(i)</code> is not in S for any i <code>&lt; n</code>.
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
    if (isEmpty()) {
      return Z.ZERO;
    }
    Z m = get(size() - 1);
    do {
      m = m.add(1);
    } while (isSquareDifference(m));
    return m;
  }
}
