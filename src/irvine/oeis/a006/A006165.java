package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006165 a(1) = a(2) = 1; thereafter a(2n+1) = a(n+1) + a(n), a(2n) = 2a(n).
 * @author Sean A. Irvine
 */
public class A006165 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    }
    return (n & 1) == 1 ? a(n / 2).multiply(2) : a(n / 2).add(a(n / 2 - 1));
  }
}

