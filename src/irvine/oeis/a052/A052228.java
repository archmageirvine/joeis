package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052228 Automorphic primes: p such that p^p ends with the digits of p.
 * @author Sean A. Irvine
 */
public class A052228 extends A000040 {

  private Z mMod = Z.TEN;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.compareTo(mMod) >= 0) {
        mMod = mMod.multiply(10);
      }
      if (p.modPow(p, mMod).equals(p)) {
        return p;
      }
    }
  }
}
