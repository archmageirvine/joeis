package irvine.oeis.a000;

import irvine.math.ReducedLatinRectangles;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000315.
 * @author Sean A. Irvine
 */
public class A000315 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return new ReducedLatinRectangles(++mN, mN).count();
  }
}
