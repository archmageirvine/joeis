package irvine.oeis.a309;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A309952 XOR contraction of binary representation of n.
 * a(0) = 0, a(4n) = 2*a(n), a(4n+1) = 2*a(n)+1, a(4n+2) = 2*a(n)+1, a(4n+3) = 2*a(n)
 * @author Georg Fischer
 */
public class A309952 extends MemorySequence {

  protected int mN;

  /** Construct the sequence. */
  public A309952() {
    mN = -1;
  }

  @Override
  public Z computeNext() {
    ++mN;
    if (mN == 0) {
      return Z.ZERO;
    } else {
      switch (mN % 4) {
        case 0:
        case 3:
          return a(mN / 4).multiply2();
        default:
          return a(mN / 4).multiply2().add(1);
      }
    }
  }
}
