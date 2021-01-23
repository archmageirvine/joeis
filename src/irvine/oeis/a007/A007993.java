package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007993 Poincar\u00e9 series [or Poincare series] of Lie algebra associated with a certain braid group.
 * @author Sean A. Irvine
 */
public class A007993 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).add(10).multiply(mN).add(35).multiply(mN).subtract(10).multiply(mN).subtract(396).multiply(mN).add(720).divide(120);
  }
}

