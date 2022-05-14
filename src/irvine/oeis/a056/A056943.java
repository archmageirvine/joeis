package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056943 Unused area of rectangle needed to enclose a non-touching spiral of length n on a square lattice.
 * @author Sean A. Irvine
 */
public class A056943 extends A056942 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().subtract(++mN);
  }
}
