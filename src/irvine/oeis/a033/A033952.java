package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a007.A007376;

/**
 * A033952 Write 1,2,... in a clockwise spiral on a square lattice, writing each digit at a separate lattice point, starting with 1 at the origin and 2 at x=0, y=-1; sequence gives the numbers on the positive x-axis.
 * @author Sean A. Irvine
 */
public class A033952 extends A007376 {

  /** Construct the sequence. */
  public A033952() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    final long t = 4 * mN * mN - 5 * mN + 2;
    while (mM < t) {
      super.next();
      ++mM;
    }
    ++mM;
    return super.next();
  }
}
