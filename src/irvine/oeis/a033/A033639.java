package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A033639 Base-2 digital convolution sequence.
 * @author Sean A. Irvine
 */
public class A033639 extends MemorySequence {

  protected int base() {
    return 2;
  }

  @Override
  protected Z computeNext() {
    if (isEmpty()) {
      return Z.ONE;
    }
    int n = size();
    int m = n;
    Z sum = Z.ZERO;
    while (n != 0) {
      sum = sum.add(get(--m).multiply(n % base()));
      n /= base();
    }
    return sum;
  }
}
