package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066838.
 * @author Sean A. Irvine
 */
public class A066919 extends Sequence1 {

  private Z mN = Z.ZERO;

  private Z f(final Z n) {
    return n.isEven() ? Euler.phi(n) : Jaguar.factor(n).sigma();
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    Z t = mN;
    while (!Z.ONE.equals(t)) {
      t = f(t);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
