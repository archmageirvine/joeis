package irvine.oeis.a393;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a018.A018252;

/**
 * A393674 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A393674 extends Sequence0 {

  private final DirectSequence mA;
  private int mN = -1;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int i) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 0) {
        return Z.ZERO;
      }
      final Z t = get(n, i - 1);
      final int c = mA.a(i).intValueExact();
      return c > n ? t : t.add(get(n - c, i - 2));
    }
  };

  protected A393674(final Sequence seq) {
    mA = DirectSequence.create(seq);
  }

  /** Construct the sequence. */
  public A393674() {
    this(new A018252());
  }

  @Override
  public Z next() {
    ++mN;
    if (mA.a(mM).intValueExact() <= mN) {
      ++mM;
    }
    return mB.get(mN, mM);
  }
}
