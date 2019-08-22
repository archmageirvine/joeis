package irvine.oeis.a000;

import irvine.math.ReducedLatinRectangles;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000576 <code>a(n)</code> is the number of <code>(n-2) X n</code> normalized Latin rectangles.
 * @author Sean A. Irvine
 */
public class A000576 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    return new ReducedLatinRectangles(++mN, mN - 2).count();
  }
}
