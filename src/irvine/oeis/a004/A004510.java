package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004510 Tersum n + 21.
 * @author Sean A. Irvine
 */
public class A004510 extends A004489 {

  private static final Z C = Z.valueOf(21);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return tersum(mN, C);
  }
}

