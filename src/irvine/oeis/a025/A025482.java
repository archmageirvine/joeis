package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A025482 <code>a(0) = 0; a(n) = a(n/3)/3</code> if <code>n = a(n/3) = 0 (mod 3); a(n) = a(n-1)+1</code> otherwise.
 * @author Sean A. Irvine
 */
public class A025482 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    if (n % 3 == 0 && get(n / 3).mod(3) == 0) {
      return get(n / 3).divide(3);
    }
    return get(n - 1).add(1);
  }
}

