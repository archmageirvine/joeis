package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004517 Generalized nim sum n + n in base 7.
 * @author Sean A. Irvine
 */
public class A004517 extends A004514 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return nimSum(7, mN, mN);
  }
}

