package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;
import irvine.util.array.LongDynamicArray;

/**
 * A046928 Smaller of twin prime pairs in consecutively larger seas of composite numbers.
 * @author Sean A. Irvine
 */
public class A046928 extends A001359 {

  private final LongDynamicArray<Z> mFirsts = new LongDynamicArray<>();
  private int mN = 0;

  private long sea(final Z p) {
    long sea = 0;
    Z q = p.subtract(1);
    while (!q.isProbablePrime()) {
      ++sea;
      q = q.subtract(1);
    }
    q = p.add(3);
    while (!q.isProbablePrime()) {
      ++sea;
      q = q.add(1);
    }
    return sea;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.THREE;
    }
    while (mFirsts.get(mN) == null) {
      final Z p = super.next();
      final long sea = sea(p);
      if (mFirsts.get(sea / 2) == null) {
        mFirsts.set(sea / 2, p);
      }
    }
    return mFirsts.get(mN);
  }
}

