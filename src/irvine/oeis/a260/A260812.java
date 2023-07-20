package irvine.oeis.a260;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A260812 a(n) is the number of edges in a rooted 2-ary tree built from the binary representation of n: each vertex at level i (i=0,...,floor(log_2(n))) has two children if the i-th most significant bit is 1 and one child if the i-th bit is 0.
 * a(0) = 1, a(1) = 2, a(2*n) = 2^A000120(2*n) + a(n), a(2*n+1) = 2^A000120(2*n+1) + a(n).
 * @author Georg Fischer
 */
public class A260812 extends MemorySequence {

  private int mN;

  /** Construct the sequence. */
  public A260812() {
    mN = -1;
  }

  @Override
  public Z computeNext() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    } else if (mN == 1) {
      return Z.TWO;
    }
    return Z.ONE.shiftLeft(Long.bitCount(mN)).add(a(mN >> 1));
  }
}
