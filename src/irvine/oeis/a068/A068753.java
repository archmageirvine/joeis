package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068753 Number of potential flows in n X n array with integer velocities in -6..6, i.e., number of n X n arrays with adjacent elements differing by no more than 6, counting arrays differing by a constant only once.
 * @author Sean A. Irvine
 */
public class A068753 extends A068744 {

  private int mN = 0;

  /** Construct the sequence. */
  public A068753() {
    super(1);
  }

  @Override
  public Z next() {
    return potentialFlows(6, ++mN);
  }
}
