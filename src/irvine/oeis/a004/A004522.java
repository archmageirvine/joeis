package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004522 Generalized nim sum <code>n + n</code> in base 12.
 * @author Sean A. Irvine
 */
public class A004522 extends A004521 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return nimsum(12, mN, mN);
  }
}

