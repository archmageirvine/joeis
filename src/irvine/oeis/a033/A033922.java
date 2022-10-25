package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A033922 Base-2 digital convolution sequence.
 * @author Sean A. Irvine
 */
public class A033922 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    Z c = Z.ZERO;
    int t = 0;
    int n = size();
    while (n != 0) {
      if ((n & 1) == 1) {
        c = c.add(a(t));
      }
      ++t;
      n /= 2;
    }
    return c;
  }
}
