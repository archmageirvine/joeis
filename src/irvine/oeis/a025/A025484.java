package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A025484 <code>a(0) = 0; a(n) = a(n/5)/5</code> if <code>n = a(n/5) = 0 (mod 5); a(n) = a(n-1)+1</code> otherwise.
 * @author Sean A. Irvine
 */
public class A025484 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    if (n % 5 == 0 && get(n / 5).mod(5) == 0) {
      return get(n / 5).divide(5);
    }
    return get(n - 1).add(1);
  }
}

