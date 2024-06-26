package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a026.A026905;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;
import irvine.oeis.memory.MemorySequence;

/**
 * A059871 Number of solutions to the equation p_i = (1+mod(i,2))*p_{i-1} +- p_{i-2} +- p_{i-3} +- ... +- 2 +- 1, where p_i is the i-th prime number (where p_1 = 2 and the "zeroth prime" p_0 is defined to be 1).
 * @author Sean A. Irvine
 */
public class A059871 extends MemoryFunctionInt2Sequence<Z> {

  /** Construct the sequence. */
  public A059871() {
    super(1);
  }

  private final MemorySequence mSP = MemorySequence.cachedSequence(new A026905());
  private int mN = 0;

  private int sp(final int m) {
    return m < 0 ? 0 : mSP.a(m).intValueExact();
  }

  @Override
  protected Z compute(final int n, final int m) {
    if (n > sp(m)) {
      return Z.ZERO;
    }
    if (m < 0) {
      return Z.ONE;
    }
    final int pm = Functions.PRIME.i(m);
    return get(n + pm, m - 1).add(get(Math.abs(n - pm), m - 1));
  }

  @Override
  public Z next() {
    ++mN;
    final int pn = Functions.PRIME.i(mN);
    final int pnm1 = Functions.PRIME.i(mN - 1);
    return get(pn - pnm1 * (1 + (mN & 1)), mN - 2);
  }
}
