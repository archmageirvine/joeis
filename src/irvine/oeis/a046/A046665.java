package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046665 Largest prime divisor of n - smallest prime divisor of n (a(1)=0).
 * @author Sean A. Irvine
 */
public class A046665 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final Z[] p = Jaguar.factor(mN).toZArray();
    return p[p.length - 1].subtract(p[0]);
  }
}
