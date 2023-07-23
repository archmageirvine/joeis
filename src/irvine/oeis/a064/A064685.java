package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064685 Length of orbit of 2n+1 in the 3x+1 problem.
 * @author Sean A. Irvine
 */
public class A064685 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    Z m = mN;
    long orbit = 1;
    while (!m.equals(Z.ONE)) {
      ++orbit;
      m = m.isEven() ? m.divide2() : m.multiply(3).add(1);
    }
    return Z.valueOf(orbit);
  }
}
