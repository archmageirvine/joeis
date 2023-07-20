package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A025482 a(0) = 0; a(n) = a(n/3)/3 if n = a(n/3) = 0 (mod 3); a(n) = a(n-1)+1 otherwise.
 * @author Sean A. Irvine
 */
public class A025482 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    if (n % 3 == 0 && a(n / 3).mod(3) == 0) {
      return a(n / 3).divide(3);
    }
    return a(n - 1).add(1);
  }
}

