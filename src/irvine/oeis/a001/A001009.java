package irvine.oeis.a001;

import irvine.math.ReducedLatinRectangles;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001009 Triangle giving number L(n,k) of normalized k X n Latin rectangles.
 * @author Sean A. Irvine
 */
public class A001009 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return new ReducedLatinRectangles(mN, mM).count();
  }
}
