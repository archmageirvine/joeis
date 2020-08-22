package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005422 Largest prime factor of 10^n - 1.
 * @author Sean A. Irvine
 */
public class A005422 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.NINE : mN.multiply(10).add(9);
    final Z[] p = Jaguar.factor(mN).toZArray();
    return p[p.length - 1];
  }
}
