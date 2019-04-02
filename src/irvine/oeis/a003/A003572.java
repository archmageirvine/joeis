package irvine.oeis.a003;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003572 Order of 3 mod 3n+2.
 * @author Sean A. Irvine
 */
public class A003572 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 3;
    return new IntegersModMul(mN).order(Z.THREE);
  }
}
