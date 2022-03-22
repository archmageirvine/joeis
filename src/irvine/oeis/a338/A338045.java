package irvine.oeis.a338;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A338045 G.f.: Sum_{k&gt;=0} x^(2^k) / (1 - x^(2^k))^3.
 * a(2*n) = a(n) + n*(2*n + 1), a(2*n+1) = (n + 1)*(2*n+1).
 * @author Georg Fischer
 */
public class A338045 extends MemorySequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A338045() {
    next();
  }

  @Override
  public Z computeNext() {
    ++mN;
    final int n = mN / 2;
    return mN == 0 ? Z.ONE : (((mN & 1) == 0) ? a(n).add(n * (2 * n + 1)) : Z.valueOf(n + 1).multiply(2 * n + 1));
  }
}
