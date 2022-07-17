package irvine.oeis.a000;

import irvine.math.ReducedLatinRectangles;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000315 Number of reduced Latin squares of order n; also number of labeled loops (quasigroups with an identity element) with a fixed identity element.
 * @author Sean A. Irvine
 */
public class A000315 implements Sequence {

  protected int mN = 0;

  @Override
  public Z next() {
    return new ReducedLatinRectangles(++mN, mN).count();
  }
}
