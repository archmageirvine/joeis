package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070896 Determinant of the Cayley addition table of Z_{n}.
 * @author Sean A. Irvine
 */
public class A070896 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.NEG_ONE.pow(++mN / 2).multiply(mN - 1).multiply(Z.valueOf(mN).pow(mN - 1)).divide2();
  }
}

