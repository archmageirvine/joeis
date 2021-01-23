package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A030194 a(0)=0; a(n) is the smallest m such that m - a(i) is not a triangular number for any i &lt; n.
 * @author Sean A. Irvine
 */
public class A030194 extends MemorySequence {

  private boolean isTriangular(final Z n) {
    return n.shiftLeft(3).add(1).isSquare();
  }

  private boolean isTriangularDifference(final Z m) {
    for (final Z a : this) {
      if (isTriangular(m.subtract(a))) {
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
    } while (isTriangularDifference(m));
    return m;
  }
}
