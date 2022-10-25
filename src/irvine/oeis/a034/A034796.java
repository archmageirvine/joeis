package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.MemorySequence;

/**
 * A034796 a(1)=1, a(n-1) is a square mod a(n), and a(n) &gt; a(n-1).
 * @author Sean A. Irvine
 */
public class A034796 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    final Z prev = a(size() - 1);
    Z n = prev;
    while (true) {
      n = n.add(1);
      if (ZUtils.isQuadraticResidue(prev, n)) {
        return n;
      }
    }
  }
}
