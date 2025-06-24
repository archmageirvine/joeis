package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078212 Smallest multiple of the n-th prime beginning and ending in n with a(1)=a(3)=0.
 * @author Sean A. Irvine
 */
public class A078212 extends A000040 {

  private long mN = 0;
  private long mMod = 10;

  @Override
  public Z next() {
    if (++mN == mMod) {
      mMod *= 10;
    }
    final Z p = super.next();
    if (Z.TWO.equals(p) || Z.FIVE.equals(p)) {
      return Z.ZERO;
    }
    Z t = p;
    final String ns = String.valueOf(mN);
    while (true) {
      if (t.mod(mMod) == mN && t.toString().startsWith(ns)) {
        return t;
      }
      t = t.add(p);
    }
  }
}

