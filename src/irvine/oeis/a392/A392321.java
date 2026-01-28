package irvine.oeis.a392;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392321 allocated for Rajesh Kumar Mohapatra.
 * @author Sean A. Irvine
 */
public class A392321 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> Z.ONE.shiftLeft(mN).subtract(1).pow(k));
  }
}
