package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A000629 Number of necklaces of partitions of n+1 labeled beads.
 * @author Sean A. Irvine
 */
public class A000629 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z r = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      final Z t = Stirling.secondKind(mN, k).multiply(mF.factorial(k)).shiftLeft(k);
      r = r.signedAdd(((mN - k) & 1) == 0, t);
    }
    return r;
  }
}

