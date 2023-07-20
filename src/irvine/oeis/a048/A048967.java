package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A048967 Number of even entries in row n of Pascal's triangle (A007318).
 * @author Sean A. Irvine
 */
public class A048967 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    return (n & 1) == 0 ? a(n / 2).add(n / 2) : a(n / 2).multiply2();
  }
}

