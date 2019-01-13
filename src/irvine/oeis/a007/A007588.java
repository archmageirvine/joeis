package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007588.
 * @author Sean A. Irvine
 */
public class A007588 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(2 * mN).subtract(1).multiply(mN);
  }
}
