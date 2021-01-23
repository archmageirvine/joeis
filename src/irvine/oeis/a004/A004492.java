package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004492 Tersum n + 3.
 * @author Sean A. Irvine
 */
public class A004492 extends A004489 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return tersum(mN, Z.THREE);
  }
}

