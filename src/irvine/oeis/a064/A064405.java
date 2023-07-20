package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A064405 Number of even entries (A048967) minus the number of odd entries (A001316) in row n of Pascal's triangle (A007318).
 * @author Sean A. Irvine
 */
public class A064405 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.NEG_ONE;
    }
    return (n & 1) == 0 ? a(n / 2).add(n / 2) : a(n / 2).multiply2();
  }
}

