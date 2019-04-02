package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004509 Tersum n + 20.
 * @author Sean A. Irvine
 */
public class A004509 extends A004489 {

  private static final Z C = Z.valueOf(20);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return tersum(mN, C);
  }
}

