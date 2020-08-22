package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004519 Generalized nim sum n + n in base 9.
 * @author Sean A. Irvine
 */
public class A004519 extends A004514 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return nimsum(9, mN, mN);
  }
}

