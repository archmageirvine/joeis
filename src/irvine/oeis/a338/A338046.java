package irvine.oeis.a338;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A338046 G.f.: Sum_{k&gt;=0} x^(2^k) / (1 - x^(2^k))^4.
 * a(2*n) = a(n) + A002492(n), a(2*n+1) = A000447(n+1).
 * a(2*n) = a(n) + 2*n*(n+1)*(2*n+1)/3, a(2*n+1) = (n + 1)*(4*(n+1)^2 - 1)/3.
 * @author Georg Fischer
 */
public class A338046 extends MemorySequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A338046() {
    setOffset(1);
    next();
  }

  @Override
  public Z computeNext() {
    ++mN;
    final int n = mN / 2;
    return mN == 0 ? Z.ONE : (((mN & 1) == 0)
      ? a(n).add(Z.valueOf(2 * n).multiply(n + 1).multiply(2 * n + 1).divide(3))
      : Z.valueOf(n + 1).multiply(4 * (n + 1) * (n + 1) - 1).divide(3));
  }
}
