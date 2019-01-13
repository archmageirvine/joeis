package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.nt.misc.GreekTour;
import irvine.oeis.Sequence;

/**
 * A000532.
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
