package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a005.A005385;
import irvine.util.array.DynamicArray;

/**
 * A059327 a(n) is smallest safe prime (A005385) such that a(n) + 12*n is the next safe prime, i.e., x = (a(n) - 1)/2 and x + 6*n are closest Sophie Germain primes.
 * @author Sean A. Irvine
 */
public class A059327 extends A005385 {

  private final DynamicArray<Z> mA = new DynamicArray<>();
  private Z mT = super.next();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == null) {
      final Z t = mT;
      mT = super.next();
      final int delta = mT.subtract(t).divide(12).intValueExact();
      if (mA.get(delta) == null) {
        mA.set(delta, t);
      }
    }
    return mA.get(mN);
  }
}
