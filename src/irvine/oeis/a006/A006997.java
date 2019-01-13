package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006997.
 * @author Sean A. Irvine
 */
public class A006997 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    return get(n / 3).multiply(3).add(n % 3).divide2();
  }
}
