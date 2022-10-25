package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A025483 a(0) = 0; a(n) = a(n/4)/4 if n = a(n/4) = 0 (mod 4); a(n) = a(n-1)+1 otherwise.
 * @author Sean A. Irvine
 */
public class A025483 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    if ((n & 3) == 0 && a(n / 4).mod(4) == 0) {
      return a(n / 4).divide(4);
    }
    return a(n - 1).add(1);
  }
}

