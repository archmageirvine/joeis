package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.MemorySequence;

/**
 * A034793 a(1)=1; thereafter a(n+1) is the least k &gt; a(n) such that k is a square mod a(i) for all  i&lt;= n.
 * @author Sean A. Irvine
 */
public class A034793 extends MemorySequence {

  {
    setOffset(1);
  }

  private boolean isSquares(final Z n) {
    for (final Z a : this) {
      if (!ZUtils.isQuadraticResidue(n, a)) {
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
