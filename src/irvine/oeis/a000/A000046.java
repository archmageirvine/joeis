package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicArray;

/**
 * A000046 Number of primitive n-bead necklaces (turning over is allowed) where complements are equivalent.
 * @author Sean A. Irvine
 */
public class A000046 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000046(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000046() {
    super(0);
  }

  private long mN = -1;
  private final LongDynamicArray<Z> mA11Cache = new LongDynamicArray<>();
  private final Sequence mA11 = new A000011();

  private Z a11(final long v) {
    while (mA11Cache.length() <= v) {
      mA11Cache.set(mA11Cache.length(), mA11.next());
    }
    return mA11Cache.get(v);
  }

  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    Z sum = a11(mN);
    for (final Z d : fs.divisors()) {
      final long dd = d.longValue();
      if (dd == 1) {
        continue;
      }
      sum = ZUtils.mobiusAdd(Mobius.mobius(dd), sum, a11(mN / dd));
    }
    return sum;
  }

}

