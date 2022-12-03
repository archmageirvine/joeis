package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A060589.
 * @author Sean A. Irvine
 */
public class A060583 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    return a(n / 3).multiply(3).add((6 - n % 3 - a(n / 3).intValue() % 3) % 3);
  }
}

