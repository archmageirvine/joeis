package irvine.oeis.a003;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003574 Order of 4 mod 4n-1.
 * @author Sean A. Irvine
 */
public class A003574 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 4;
    return new IntegersModMul(mN).order(Z.FOUR);
  }
}
