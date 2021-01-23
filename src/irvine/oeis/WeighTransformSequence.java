package irvine.oeis;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Compute the WEIGH transform of another sequence.  Corresponds to <code>weighout</code>
 * in the Maple transforms.
 * @author Sean A. Irvine
 */
public class WeighTransformSequence extends MemoryFunction2<Integer, Z> implements Sequence {

  private final MemorySequence mH;
  private int mN = -1;

  /**
   * Construct the weigh transform of the given sequence.
   * @param seq sequence
   */
  public WeighTransformSequence(final Sequence seq) {
    mH = MemorySequence.cachedSequence(seq);
  }

  private Z h(final int m) {
    // Treat values beyond end of a finite sequence as 0
    // (necessary for some sequences such A038084)
    final Z t = mH.a(m);
    return t == null ? Z.ZERO : t;
  }

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n == 0) {
      return Z.ONE;
    }
    if (m < 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int j = 0; j <= n / m; ++j) {
      sum = sum.add(Binomial.binomial(h(m), Z.valueOf(j)).multiply(get(n - m * j, m - 1)));
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
