package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068745 Number of potential flows in 4 X 4 array with integer velocities in -n..n, i.e., number of 4 X 4 arrays with adjacent elements differing by no more than n, counting arrays differing by a constant only once.
 * @author Sean A. Irvine
 */
public class A068745 extends A068744 {

  private int mN = -1;

  @Override
  public Z next() {
    return potentialFlows(++mN, 4);
  }
}
