package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068754 Number of potential flows in n X n array with integer velocities in -7..7, i.e., number of n X n arrays with adjacent elements differing by no more than 7, counting arrays differing by a constant only once.
 * @author Sean A. Irvine
 */
public class A068754 extends A068744 {

  private int mN = 0;

  /** Construct the sequence. */
  public A068754() {
    super(1);
  }

  @Override
  public Z next() {
    return potentialFlows(7, ++mN);
  }
}
