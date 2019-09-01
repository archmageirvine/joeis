package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A025483 <code>a(0) = 0; a(n) = a(n/4)/4</code> if <code>n = a(n/4) = 0 (mod 4); a(n) = a(n-1)+1</code> otherwise.
 * @author Sean A. Irvine
 */
public class A025483 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    if ((n & 3) == 0 && get(n / 4).mod(4) == 0) {
      return get(n / 4).divide(4);
    }
    return get(n - 1).add(1);
  }
}

