package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046109 Number of lattice points (x,y) on the circumference of a circle of radius n with center at (0,0).
 * @author Sean A. Irvine
 */
public class A046109 extends A046080 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().multiply(8).add(4);
  }
}
