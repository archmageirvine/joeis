package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010751 Up once, down twice, up three times, down four times, ...
 * @author Sean A. Irvine
 */
public class A010751 implements Sequence {

  private long mA = 1;
  private long mSteps = 2;
  private long mDirection = -1;
  private long mN = 0;

  @Override
  public Z next() {
    if (--mSteps == 0) {
      mSteps = ++mN;
      mDirection = -mDirection;
    }
    mA += mDirection;
    return Z.valueOf(mA);
  }
}
