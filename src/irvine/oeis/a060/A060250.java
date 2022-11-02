package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a054.A054990;
import irvine.util.array.DynamicLongArray;

/**
 * A060250 The smallest k! + 1 with exactly n prime factors (with multiplicity).
 * @author Sean A. Irvine
 */
public class A060250 extends A054990 {

  private final DynamicLongArray mA = new DynamicLongArray();
  private int mM = 0;

  @Override
  public Z next() {
    ++mM;
    while (mA.get(mM) == 0) {
      final int t = super.next().intValueExact();
      if (mA.get(t) == 0) {
        mA.set(t, mN);
      }
    }
    return Z.valueOf(mA.get(mM));
  }
}
