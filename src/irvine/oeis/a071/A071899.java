package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071899 a(0)=1 and for n&gt;0: a(n) = least prime&gt;a(n-1) of form 1+k*n.
 * @author Sean A. Irvine
 */
public class A071899 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z t = mA.subtract(1).divide(mN).multiply(mN);
    while (true) {
      t = t.add(mN);
      final Z u = t.add(1);
      if (u.isProbablePrime()) {
        mA = u;
        return mA;
      }
    }
  }
}
