package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070278 Smallest prime &gt; 2n+1 beginning and ending with 2n+1, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A070278 extends Sequence0 {

  private long mN = -1;
  private long mMod = 10;

  @Override
  public Z next() {
    mN += 2;
    if (mN % 5 == 0) {
      return Z.ZERO;
    }
    if (mN >= mMod) {
      mMod *= 10;
    }
    Z t = Z.valueOf(mN).multiply(mMod);
    final Z v = t.add(mN);
    if (v.isProbablePrime()) {
      return v; // No need to insert any digits
    }
    t = t.multiply(10);
    long insert = -1;
    long lim = 10;
    while (true) {
      if (++insert == lim) {
        t = t.multiply(10);
        lim *= 10;
        //insert = 0; // Insignificant leading 0s apparently not permitted.
      }
      final Z u = t.add(Z.valueOf(insert).multiply(mMod)).add(mN);
      if (u.isProbablePrime()) {
        return u;
      }
    }
  }
}
