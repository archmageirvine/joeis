package irvine.oeis.a080;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SequenceFactory;
import irvine.oeis.UnimplementedException;

/**
 * A080888 Number of compositions of n into Fibonacci numbers (1 counted as two distinct Fibonacci numbers).
 * @author Georg Fischer
 */
public class A080888 extends AbstractSequence implements DirectSequence {

  private static final String SEQ_ID = "A000045.skip(1)";
  private int mN;

  /** Construct the sequence. */
  public A080888() {
    super(0);
    mN = -1;
  }

  private final MemoryFunction1<Z> mF = new MemoryFunction1<Z>() {
    @Override
    protected Z compute(final int n) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      try {
        final Sequence seq = SequenceFactory.sequence(SEQ_ID);
        int term = seq.next().intValueExact();
        while (term <= n) {
          sum = sum.add(get(n - term));
          term = seq.next().intValueExact();
        }
      } catch (final UnimplementedException exc) {
        throw new RuntimeException(SEQ_ID + " not yet implemented", exc);
      }
      return sum;
    }
  };

  @Override
  public Z a(final int n) {
    return mF.get(n);
  }

  @Override
  public Z a(final Z n) {
    return mF.get(n.intValueExact());
  }

  @Override
  public Z next() {
    return mF.get(++mN);
  }
}
