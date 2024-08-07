package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a004.A004489;

/**
 * A071770 Tersum n + [n/3] (answer recorded in base 10).
 * @author Sean A. Irvine
 */
public class A071770 extends A004489 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return tersum(mN, mN.divide(3));
  }
}

