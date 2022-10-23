package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058842 From Renyi's "beta expansion of 1 in base 3/2": sequence gives a(1), a(2), ... where x(n) = a(n)/2^n, with 0 &lt; a(n) &lt; 2^n, a(1) = 1, a(n) = 3*a(n-1) modulo 2^n.
 * @author Sean A. Irvine
 */
public class A058842 extends Sequence1 {

  private Z mA = null;
  private Z mMod = Z.ONE;

  @Override
  public Z next() {
    mMod = mMod.multiply2();
    mA = mA == null ? Z.ONE : mA.modMultiply(Z.THREE, mMod);
    return mA;
  }
}
