package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A025481 a(0) = 0; a(n) = a(n/2)/2 if n = a(n/2) = 0 (mod 2); a(n) = a(n-1)+1 otherwise.
 * @author Sean A. Irvine
 */
public class A025481 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    if ((n & 1) == 0 && a(n / 2).isEven()) {
      return a(n / 2).divide2();
    }
    return a(n - 1).add(1);
  }
}

