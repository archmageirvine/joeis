package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004482 Tersum <code>n + 1 (answer</code> recorded in base <code>10)</code>.
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

