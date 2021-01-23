package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005766 a(n) = cost of minimal multiplication-cost addition chain for n.
 * @author Sean A. Irvine
 */
public class A005766 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    final int m = n / 2;
    if ((n & 1) == 0) {
      return get(m).add(m * m);
    } else {
      return get(m).add(m * (m + 2));
    }
  }
}

