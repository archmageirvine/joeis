package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019530 Smallest number m such that <code>m^m</code> is divisible by <code>n</code>.
 * @author Sean A. Irvine
 */
public class A019530 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = Z.ZERO;
    while (!Z.ZERO.equals(m.modPow(m, mN))) {
      m = m.add(1);
    }
    return m;
  }
}

