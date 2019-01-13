package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006157.
 * @author Sean A. Irvine
 */
public class A006157 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mF.multiply(2 * mN - 1).divide(6);
  }
}

