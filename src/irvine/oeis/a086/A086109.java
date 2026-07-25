package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086109 Numbers n such that p=prime(n) is substring of 2^p-1.
 * @author Sean A. Irvine
 */
public class A086109 extends A000040 {

  private long mN = 0;
  private Z mMod = Z.TEN;

  private boolean is(Z t, final Z p) {
    while (t.compareTo(p) >= 0) {
      if (t.mod(mMod).equals(p)) {
        return true;
      }
      t = t.divide(10);
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      if (p.compareTo(mMod) >= 0) {
        mMod = mMod.multiply(10);
      }
      final Z t = Z.TWO.pow(p).subtract(1);
      if (is(t, p)) {
        return Z.valueOf(mN);
      }
    }
  }
}

