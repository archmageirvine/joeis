package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a054.A054269;
import irvine.util.array.DynamicArray;

/**
 * A059800 Smallest prime p such that the quotient-cycle length in continued fraction expansion of sqrt(p) is n: smallest prime p(m) for which A054269(m)=n.
 * @author Sean A. Irvine
 */
public class A059800 extends A054269 {

  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final int t = super.next().intValueExact();
      if (mFirsts.get(t) == null) {
        mFirsts.set(t, mP);
      }
    }
    return mFirsts.get(mN);
  }
}
