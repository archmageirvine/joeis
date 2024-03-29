package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A033667 Base 3 digital convolution sequence, (with smallest digits).
 * @author Sean A. Irvine
 */
public class A033667 extends MemorySequence {

  protected int base() {
    return 3;
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    final String s = Long.toString(size(), base());
    Z sum = Z.ZERO;
    for (int m = 0; m < s.length(); ++m) {
      sum = sum.add(a(m).multiply(s.charAt(m) - '0'));
    }
    return sum;
  }
}
