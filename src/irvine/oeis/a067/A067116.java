package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067102.
 * @author Sean A. Irvine
 */
public class A067116 extends Sequence1 {

  private long mN = 0;
  private long mSum = 0;
  private final StringBuilder mY = new StringBuilder();

  @Override
  public Z next() {
    mSum += ++mN;
    mY.append(mN);
    return new Z(mY).divide(mSum);
  }
}
