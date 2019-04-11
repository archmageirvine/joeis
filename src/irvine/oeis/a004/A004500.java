package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004500 Tersum <code>n + 11</code>.
 * @author Sean A. Irvine
 */
public class A004500 extends A004489 {

  private static final Z C = Z.valueOf(11);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return tersum(mN, C);
  }
}

