package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001534.
 * @author Sean A. Irvine
 */
public class A001534 implements Sequence {

  private long mN = -8;

  @Override
  public Z next() {
    mN += 9;
    return Z.valueOf(mN).multiply(mN + 7);
  }
}
