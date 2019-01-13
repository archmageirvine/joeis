package irvine.oeis.a003;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003573.
 * @author Sean A. Irvine
 */
public class A003573 implements Sequence {

  private long mN = -3;

  @Override
  public Z next() {
    mN += 4;
    return mN == 1 ? Z.ONE : new IntegersModMul(mN).order(Z.FOUR);
  }
}
