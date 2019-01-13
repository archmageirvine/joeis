package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A000198.
 * @author Sean A. Irvine
 */
public class A000198 extends MemorySequence {

  // After Alois P. Heinz

  private int mN = 0;

  {
    add(null);
  }

  private int ilog3(final int n) {
    long m = n;
    int l = 0;
    while (m >= 3) {
      ++l;
      m /= 3;
    }
    return l;
  }

  @Override
  public Z computeNext() {
    final int nl = ilog3(++mN);
    if (Z.THREE.pow(nl).longValueExact() == mN) {
      return Z.THREE.pow(Z.THREE.pow(ilog3(mN)).subtract(1).divide2().intValueExact());
    }
    int t;
    if (mN % 5 == 0 && (t = Z.THREE.pow(ilog3(mN / 5)).intValueExact()) == mN / 5) {
      return Z.THREE.pow((t * 5 - 5) / 2).multiply(5);
    }
    if (mN % 7 == 0 && (t = Z.THREE.pow(ilog3(mN / 7)).intValueExact()) == mN / 7) {
      return Z.THREE.pow((t * 7 - 5) / 2).multiply(7);
    }
    if (mN % 3 == 0) {
      return Z.THREE.pow(mN / 3).multiply(get(mN / 3));
    }
    t = mN % 9;
    if (t == 1 || t == 2 || t == 4) {
      return get(mN - 1);
    }
    if (t == 8) {
      return get(mN - 1).max(get(5).multiply(get(mN - 5)));
    }
    if (t == 5) {
      return get(2).multiply(get(mN - 2)).max(get(5).multiply(get(mN - 5))).max(get(7).multiply(get(mN - 7)));
    }
    return get(7).multiply(get(mN - 7));
  }
}
