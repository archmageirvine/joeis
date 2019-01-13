package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001561.
 * @author Sean A. Irvine
 */
public class A001561 implements Sequence {

  private long mN = -4;

  @Override
  public Z next() {
    mN += 7;
    return Z.valueOf(mN).multiply(mN + 2).multiply(mN + 3);
  }
}
