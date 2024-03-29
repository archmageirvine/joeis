package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A033923 Base 3 digital convolution sequence.
 * @author Sean A. Irvine
 */
public class A033923 extends MemorySequence {

  {
    setOffset(1);
  }

  protected int base() {
    return 3;
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    Z c = Z.ZERO;
    int t = 0;
    int n = size();
    while (n != 0) {
      c = c.add(a(t).multiply(n % base()));
      ++t;
      n /= base();
    }
    return c;
  }
}
