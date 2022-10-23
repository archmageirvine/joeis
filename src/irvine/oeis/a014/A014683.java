package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014683 In the sequence of positive integers add 1 to each prime number.
 * @author Sean A. Irvine
 */
public class A014683 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isProbablePrime() ? mN.add(1) : mN;
  }
}
