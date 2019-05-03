package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005255 <code>Atkinson-Negro-Santoro</code> sequence: <code>a(n+1) = 2a(n) - a(n-floor(n/2+1))</code>.
 * @author Sean A. Irvine
 */
public class A005255 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    return n <= 2 ? Z.valueOf(n) : get(n - 1).multiply2().subtract(get(n - 2 - (n - 1) / 2));
  }
}

