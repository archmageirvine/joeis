package irvine.oeis.a048;

import irvine.math.MemoryFunction1;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000372;

/**
 * A048143 Number of labeled connected simplicial complexes with n nodes.
 * @author Sean A. Irvine
 */
public class A048143 extends CachedSequence {

  // After Robert P. P. McKone

  private final DirectSequence mA = DirectSequence.create(new A000372());

  /** Construct the sequence. */
  public A048143() {
    super(0);
  }

  private final MemoryFunction1<Z> mU = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      Z sum = Z.ZERO;
      for (int j = 0; j <= n; ++j) {
        sum = sum.add(mA.a(n - j).subtract(1).multiply(Binomial.binomial(n, j)).multiply(Z.NEG_ONE.pow(j)));
      }
      return sum;
    }
  };

  @Override
  protected Z compute(final Z nn) {
    if (nn.isZero()) {
      return Z.ONE;
    }
    final int n = nn.intValueExact();
    Z sum = mU.get(n);
    for (int k = 1; k < n; ++k) {
      sum = sum.subtract(Binomial.binomial(n - 1, k - 1).multiply(mU.get(n - k)).multiply(a(k)));
    }
    return sum;
  }
}

