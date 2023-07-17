package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046111 Number of lattice points on circumference of a circle of radius 1/3,2/3,4/3,5/3,... with center at (1/3,0).
 * @author Sean A. Irvine
 */
public class A046111 extends A046080 {

  /** Construct the sequence. */
  public A046111() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 2) {
      super.next();
      mN = 0;
    }
    return super.next().multiply2().add(1);
  }
}
