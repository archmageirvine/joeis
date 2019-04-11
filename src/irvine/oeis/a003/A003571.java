package irvine.oeis.a003;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003571 Order of <code>3 mod 3n+1</code>.
 * @author Sean A. Irvine
 */
public class A003571 implements Sequence {

  private long mN = -2;

  @Override
  public Z next() {
    mN += 3;
    return mN == 1 ? Z.ONE : new IntegersModMul(mN).order(Z.THREE);
  }
}
