package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001651 Numbers not divisible by 3.
 * @author Sean A. Irvine
 */
public class A001651 implements Sequence {

  private long mN = -1;
  private long mA = 1;

  @Override
  public Z next() {
    mA = 3 - mA;
    mN += mA;
    return Z.valueOf(mN);
  }
}
