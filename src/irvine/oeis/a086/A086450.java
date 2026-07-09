package irvine.oeis.a086;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A086450 a(0) = 1, a(2n+1) = a(n), a(2n) = a(n) + a(n-1) + ... + a(n-m) + ... where a(n&lt;0) = 0.
 * @author Sean A. Irvine
 */
public class A086450 extends CachedSequence {

  // After Alois P. Heinz

  /** Construct the sequence. */
  public A086450() {
    super(0);
  }

  private final MemoryFunction1<Z> mS = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      return a(n).add(n == 0 ? Z.ZERO : get(n - 1));
    }
  };

  @Override
  protected Z compute(final Z nn) {
    final long n = nn.longValueExact();
    if (n == 0) {
      return Z.ONE;
    }
    return (n & 1) == 1 ? a(n / 2) : mS.get(n / 2);
  }
}
