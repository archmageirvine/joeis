package irvine.oeis.a055;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055388.
 * @author Sean A. Irvine
 */
public class A055388 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return mN == 1 ? Z.TWO : Z.TWO.lcm(new IntegersModMul(mN).order(Z.TWO));
  }
}
