package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.MemorySequence;

/**
 * A034901 a(n) is square mod a(i), i &lt; n; a(n) nonsquare; a(1) = 2.
 * @author Sean A. Irvine
 */
public class A034901 extends MemorySequence {

  private boolean isQuadraticResidue(final Z m) {
    for (final Z t : this) {
      if (!ZUtils.isQuadraticResidue(m, t)) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.TWO;
    }
    Z m = get(size() - 1);
    while (true) {
      m = m.add(1);
      if (!m.isSquare() && isQuadraticResidue(m)) {
        return m;
      }
    }
  }
}
