package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068747 Number of potential flows in 6 X 6 array with integer velocities in -n..n, i.e., number of 6 X 6 arrays with adjacent elements differing by no more than n, counting arrays differing by a constant only once.
 * @author Sean A. Irvine
 */
public class A068747 extends A068744 {

  private int mN = -1;

  @Override
  public Z next() {
    return potentialFlows(++mN, 6);
  }
}
