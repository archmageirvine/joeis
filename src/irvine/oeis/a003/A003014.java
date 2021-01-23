package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003014 Expansion of e.g.f.: 1 + x*exp(x) + x^2*exp(2*x) + x^3*exp(3*x).
 * @author Sean A. Irvine
 */
public class A003014 implements Sequence {

  private long mN = -1;
  private int mA = -2;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z n = Z.valueOf(mN);
    final Z u = n.multiply(mN - 1);
    final Z v = u.multiply(mN - 2);
    if (mN > 3) {
      mB = mB.multiply(3);
    }
    return n.add(u.shiftLeft(++mA)).add(v.multiply(mB));
  }
}
