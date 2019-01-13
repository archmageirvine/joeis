package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004516.
 * @author Sean A. Irvine
 */
public class A004516 extends A004514 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return nimsum(6, mN, mN);
  }
}

