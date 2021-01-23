package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004501 Tersum n + 12.
 * @author Sean A. Irvine
 */
public class A004501 extends A004489 {

  private static final Z C = Z.valueOf(12);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return tersum(mN, C);
  }
}

