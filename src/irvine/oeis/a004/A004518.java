package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004518 Generalized nim sum n + n in base 8.
 * @author Sean A. Irvine
 */
public class A004518 extends A004514 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return nimsum(8, mN, mN);
  }
}

