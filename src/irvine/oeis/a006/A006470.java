package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006470.
 * @author Sean A. Irvine
 */
public class A006470 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN + 3).multiply(mN + 2).multiply(mN + 1).multiply(mN + 1).multiply(mN).divide(24);
  }
}
