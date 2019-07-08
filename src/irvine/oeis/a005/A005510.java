package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005510 <code>a(n) = 1 + a(floor(n/2))*a(ceiling(n/2))</code> for <code>n &gt; 1, a(1) = 3</code>.
 * @author Sean A. Irvine
 */
public class A005510 extends MemorySequence {

  {
    add(null);
  }

  protected Z start() {
    return Z.THREE;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    return n == 1 ? start() : Z.ONE.add(get(n / 2).multiply(get((n + 1) / 2)));
  }
}
