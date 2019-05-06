package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.a014.A014097;
import irvine.util.array.LongDynamicArray;

/**
 * A020999 Conjectured number of irreducible multiple zeta values of depth n and weight <code>3n</code> (confirmed up to <code>n=7)</code>.
 * @author Sean A. Irvine
 */
public class A020999 extends A014097 {

  private final LongDynamicArray<Z> mA = new LongDynamicArray<>();
  private long mN = 0;
  {
    mA.set(0, Z.ZERO);
  }

  private Z get(final long d) {
    while (d >= mA.length()) {
      mA.set(mA.length(), super.next());
    }
    return mA.get(d);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(get(d).multiply(Mobius.mobius(mN / d)));
    }
    return sum.divide(mN);
  }
}
