package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A003071.
 * @author Sean A. Irvine
 */
public class A003071 extends MemorySequence {

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int s = size() - 1;
    if (s == 0) {
      return Z.ZERO;
    }
    int a = -1;
    int b = 1;
    while (s % b == 0) {
      b <<= 1;
      ++a;
    }
    return get(s).add(Z.ONE.shiftLeft(a)).add(Integer.bitCount(s) - 1);
  }
}
