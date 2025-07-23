package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.DynamicIntArray;

/**
 * A078894 Start with a list of all the primes and repeatedly add the first element A of the list to the sequence and strike off every A-th element of the list.
 * @author Sean A. Irvine
 */
public class A078894 extends A000040 {

  private final DynamicIntArray mP = new DynamicIntArray();
  private final DynamicIntArray mCnt = new DynamicIntArray();

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      boolean eliminated = false;
      for (int k = 0; k < mP.length(); ++k) {
        if (mCnt.add(k, -1) == 0) {
          // p is eliminated
          eliminated = true;
          mCnt.set(k, mP.get(k));
          break;
        }
      }
      if (!eliminated) {
        final int m = mP.length();
        final int q = p.intValueExact();
        mP.set(m, q);
        mCnt.set(m, q - 1);
        return p;
      }
    }
  }
}
