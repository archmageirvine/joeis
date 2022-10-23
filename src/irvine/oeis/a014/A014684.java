package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014684 In the sequence of positive integers subtract 1 from each prime number.
 * @author Sean A. Irvine
 */
public class A014684 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isProbablePrime() ? mN.subtract(1) : mN;
  }
}
