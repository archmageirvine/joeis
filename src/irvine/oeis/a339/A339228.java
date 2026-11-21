package irvine.oeis.a339;

import irvine.math.MemoryFunction1;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003430;
import irvine.oeis.triangle.Triangle;

/**
 * A339228 Triangle read by rows: T(n,k) is the number of oriented series-parallel networks with n colored elements using exactly k colors.
 * @author Gregory Morse
 */
public class A339228 extends Triangle {
  private static final class Colored extends A003430 {
    private Colored(final int colors) {
      super(0, colors);
    }
  }

  private final MemoryFunction1<DirectSequence> mColors = new MemoryFunction1<>() {
    @Override
    protected DirectSequence compute(final int colors) {
      return DirectSequence.create(colorings(colors));
    }
  };

  /** Construct the sequence. */
  public A339228() {
    setOffset(1);
  }

  protected Sequence colorings(final int colors) {
    return new Colored(colors);
  }

  protected final Z atMost(final int n, final int k) {
    return mColors.get(k).a(n);
  }

  @Override
  protected Z compute(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int j = 1; j <= k + 1; ++j) {
      sum = sum.signedAdd(((k + 1 - j) & 1) == 0, Binomial.binomial(k + 1, j).multiply(atMost(n + 1, j)));
    }
    return sum;
  }
}
