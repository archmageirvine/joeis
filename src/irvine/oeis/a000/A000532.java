package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.nt.misc.GreekTour;
import irvine.oeis.Sequence;

/**
 * A000532 Number of Hamiltonian paths from NW to SW corners in an <code>n X n</code> grid.
 * @author Sean A. Irvine
 */
public class A000532 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return GreekTour.greek(mN, mN);
  }
}
