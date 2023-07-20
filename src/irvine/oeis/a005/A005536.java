package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A005536 a(0) = 0; thereafter a(2n) = n - a(n) - a(n-1), a(2n+1) = n - 2a(n) + 1.
 * @author Georg Fischer
 */
public class A005536 extends MemorySequence {

  protected int mN;

  /** Construct the sequence. */
  public A005536() {
    mN = -1;
    add(Z.ZERO);
    add(Z.ONE);
  }
  
  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    final int m = n / 2;
    if ((n & 1) == 0) {
      return Z.valueOf(m).subtract(a(m)).subtract(a(m - 1));
    } else {
      return Z.valueOf(m + 1).subtract(a(m).multiply2());
    }
  }
}
