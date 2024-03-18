package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068759 Number of potential flows in n X n array with integer velocities in -12..12, i.e., number of n X n arrays with adjacent elements differing by no more than 12, counting arrays differing by a constant only once.
 * @author Sean A. Irvine
 */
public class A068759 extends A068744 {

  private int mN = 0;

  /** Construct the sequence. */
  public A068759() {
    super(1);
  }

  @Override
  public Z next() {
    return potentialFlows(12, ++mN);
  }
}
