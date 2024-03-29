package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A005255 Atkinson-Negro-Santoro sequence: a(n+1) = 2*a(n) - a(n-floor(n/2+1)).
 * @author Sean A. Irvine
 */
public class A005255 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    return n <= 2 ? Z.valueOf(n) : a(n - 1).multiply2().subtract(a(n - 2 - (n - 1) / 2));
  }
}

