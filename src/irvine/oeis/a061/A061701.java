package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.util.array.DynamicLongArray;

/**
 * A061701 Smallest number m such that GCD of d(m^2) and d(m) is 2n+1 where d(m) is the number of divisors of m.
 * @author Sean A. Irvine
 */
public class A061701 extends A061680 {

  // This is not good enough to get more than a few terms

  private final DynamicLongArray mFirst = new DynamicLongArray();
  private int mN = -1;
  private long mM = 0;

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirst.get(mN) == 0) {
      ++mM;
      final Z g = super.next();
      if (g.isOdd()) {
        final int h = g.divide2().intValueExact();
        if (mFirst.get(h) == 0) {
          mFirst.set(h, mM);
        }
      }
    }
    return Z.valueOf(mFirst.get(mN));
  }
}

