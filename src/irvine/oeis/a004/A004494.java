package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004494 Tersum n + 5.
 * @author Sean A. Irvine
 */
public class A004494 extends A004489 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return tersum(mN, Z.FIVE);
  }
}

