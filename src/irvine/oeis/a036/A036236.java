package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036236 Least inverse of A015910: smallest integer k &gt; 0 such that 2^k mod k = n, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A036236 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (Z.ONE.equals(mN)) {
      return Z.ZERO;
    } else if (Z.THREE.equals(mN)) {
      return Z.valueOf(4700063497L); // efficiency
    }
    Z k = Z.ONE;
    while (!mN.equals(Z.TWO.modPow(k, k))) {
      k = k.add(1);
    }
    return k;
  }
}

