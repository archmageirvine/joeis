package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.MemorySequence;

/**
 * A034791 a(n) is square mod a(i), i &lt; n.
 * @author Sean A. Irvine
 */
public class A034791 extends MemorySequence {

  {
    setOffset(1);
  }

  private boolean isSquares(final Z n) {
    for (final Z a : this) {
      if (!ZUtils.isQuadraticResidue(a, n)) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    Z t = get(size() - 1);
    while (true) {
      t = t.add(1);
      if (isSquares(t)) {
        return t;
      }
    }
  }
}
