package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068755 Number of potential flows in n X n array with integer velocities in -8..8, i.e., number of n X n arrays with adjacent elements differing by no more than 8, counting arrays differing by a constant only once.
 * @author Sean A. Irvine
 */
public class A068755 extends A068744 {

  private int mN = 0;

  /** Construct the sequence. */
  public A068755() {
    super(1);
  }

  @Override
  public Z next() {
    return potentialFlows(8, ++mN);
  }
}
