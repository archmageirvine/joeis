package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007291 Series expansion for rectilinear polymers on square lattice.
 * @author Sean A. Irvine
 */
public class A007291 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(11).subtract(13).multiply(mN).add(3).multiply(mN).multiply(mN - 1).divide(6);
  }
}
