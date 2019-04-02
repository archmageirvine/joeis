package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007986 Co-growth function of a certain group.
 * @author Sean A. Irvine
 */
public class A007986 implements Sequence {

  private static final Z ELEVEN = Z.valueOf(11);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z a = Z.TWO.multiply(ELEVEN.pow(mN - 1));
    return (mN & 1) == 0 ? a.signedAdd((mN & 2) == 0, Z.TEN.multiply(Z.valueOf(11).pow(mN / 2 - 1))) : a;
  }
}
