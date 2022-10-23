package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005567 Number of walks on square lattice.
 * @author Sean A. Irvine
 */
public class A005567 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.EIGHT.multiply(mN).add(24).multiply(mN).subtract(16).shiftLeft(mN).add(mN * (long) mN + 11L * mN + 26);
  }
}
