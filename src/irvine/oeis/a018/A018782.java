package irvine.oeis.a018;

import java.util.Map;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a054.A054994;
import irvine.util.array.LongDynamicArray;

/**
 * A018782 Smallest k such that circle x^2 + y^2 = k passes through exactly 4n integer points.
 * @author Sean A. Irvine
 */
public class A018782 extends A054994 {

  private final LongDynamicArray<Z> mFirsts = new LongDynamicArray<>();
  private long mN = 0;

  protected Z select(final Map.Entry<Z, int[]> entry) {
    // Side effect, updates mFirsts

    // Create a factor sequence for this value (all values already known to be prime)
    final FactorSequence fs = new FactorSequence();
    final int[] exponents = entry.getValue();
    for (int k = 0; k < exponents.length; ++k) {
      fs.add(mA2144.get(k), FactorSequence.PRIME, exponents[k]);
    }
    final long divisorCount = fs.sigma0();
    if (mFirsts.get(divisorCount) == null) {
      mFirsts.set(divisorCount, entry.getKey());
    }

    // Doesn't actually matter what we return, since we ignore it anyway
    return Z.ZERO;
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      super.next();
    }
    return mFirsts.get(mN);
  }
}
