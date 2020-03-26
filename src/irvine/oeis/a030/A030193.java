package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A030193.
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
