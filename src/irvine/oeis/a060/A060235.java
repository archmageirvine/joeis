package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.DynamicArray;

/**
 * A060235 Smallest primes whose residue modulo its difference from the next prime is 2n-1.
 * @author Sean A. Irvine
 */
public class A060235 extends A000040 {

  private final DynamicArray<Z> mA = new DynamicArray<>();
  private int mN = -1;
  private Z mP = super.next();

  @Override
  public Z next() {
    mN += 2;
    while (mA.get(mN) == null) {
      final Z q = mP;
      mP = super.next();
      final int d = q.mod(mP.subtract(q)).intValue();
      if (mA.get(d) == null) {
        mA.set(d, q);
      }
    }
    return mA.get(mN);
  }
}
