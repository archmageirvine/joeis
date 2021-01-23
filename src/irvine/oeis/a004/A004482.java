package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004482 Tersum n + 1 (answer recorded in base 10).
 * @author Sean A. Irvine
 */
public class A004482 extends A004489 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return tersum(mN, Z.ONE);
  }
}

