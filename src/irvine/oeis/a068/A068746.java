package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068746 Number of potential flows in 5 X 5 array with integer velocities in -n..n, i.e., number of 5 X 5 arrays with adjacent elements differing by no more than n, counting arrays differing by a constant only once.
 * @author Sean A. Irvine
 */
public class A068746 extends A068744 {

  private int mN = -1;

  @Override
  public Z next() {
    return potentialFlows(++mN, 5);
  }
}
