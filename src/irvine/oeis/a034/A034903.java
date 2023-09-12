package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.memory.MemorySequence;

/**
 * A034903 a(i) is a square mod a(j), i &lt;&gt; j.
 * @author Sean A. Irvine
 */
public class A034903 extends MemorySequence {

  {
    setOffset(1);
  }

  private boolean isQuadraticResidue(final Z m) {
    for (final Z t : this) {
      if (!ZUtils.isQuadraticResidue(m, t) || !ZUtils.isQuadraticResidue(t, m)) {
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
    Z m = a(size() - 1);
    while (true) {
      m = m.add(1);
      if (!m.isSquare() && isQuadraticResidue(m)) {
        return m;
      }
    }
  }
}
