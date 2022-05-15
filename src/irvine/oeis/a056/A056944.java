package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056944 Amount by which used area of rectangle needed to enclose a non-touching spiral of length n on a square lattice exceeds unused area.
 * @author Sean A. Irvine
 */
public class A056944 extends A056942 {

  private long mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mN).subtract(super.next());
  }
}
