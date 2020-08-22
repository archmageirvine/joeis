package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a007.A007376;

/**
 * A033988 Write 0,1,2,... in a clockwise spiral on a square lattice, writing each digit at a separate lattice point, starting with 0 at the origin and 1 at x=0, y=-1; sequence gives the numbers on the positive y-axis.
 * @author Sean A. Irvine
 */
public class A033988 extends A007376 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    final long t = 4 * mN * mN + mN;
    while (mM < t) {
      super.next();
      ++mM;
    }
    ++mM;
    return super.next();
  }
}
