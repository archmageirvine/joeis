package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A065620 a(0)=0; thereafter a(2n) = 2a(n), a(2n+1) = -2a(n) + 1.
 * @author Sean A. Irvine
 */
public class A065620 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    return (n & 1) == 0 ? a(n / 2).multiply2() : Z.ONE.subtract(a(n / 2).multiply2());
  }
}

