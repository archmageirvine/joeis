package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A061655 The number 2 (that is, 1+1) in the Witt vector ring for p=2 over the integers.
 * @author Sean A. Irvine
 */
public class A061655 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    Z sum = Z.TWO;
    for (int j = 0; j < n; ++j) {
      sum = sum.subtract(a(j).pow(1L << (n - j)).shiftLeft(j));
    }
    return sum.shiftRight(n);
  }
}

