package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005510 <code>a(n)=1+a([ n/2 ])*a(</code> ceiling <code>( n/2 ) )</code>.
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
