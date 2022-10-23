package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053041 Smallest n-digit number divisible by n.
 * @author Sean A. Irvine
 */
public class A053041 extends Sequence1 {

  private Z mA = null;
  private long mN = 0;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return mA.add(mN).divide(++mN).multiply(mN);
  }
}
