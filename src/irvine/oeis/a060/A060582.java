package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A060589.
 * @author Sean A. Irvine
 */
public class A060582 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    if (n % 3 == a(n / 3).intValue()) {
      return a(n / 3);
    } else {
      return Z.THREE.subtract(a(n / 3).add(n % 3)).mod(Z.THREE);
    }
  }
}
