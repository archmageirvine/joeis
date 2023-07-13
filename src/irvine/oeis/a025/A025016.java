package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025016 Final digits of !n = Sum_{i=0..n} i! (A003422) for very large n, read from right.
 * @author Sean A. Irvine
 */
public class A025016 extends Sequence0 {

  private Z mMod = Z.ONE;

  @Override
  public Z next() {
    final Z t = mMod;
    mMod = mMod.multiply(10);
    Z f = Z.ONE;
    Z s = Z.TWO; // 0! + 1!
    long k = 1;
    while (!f.mod(mMod).isZero()) {
      f = f.modMultiply(++k, mMod);
      s = s.add(f);
    }
    return s.divide(t).mod(Z.TEN);
  }
}

