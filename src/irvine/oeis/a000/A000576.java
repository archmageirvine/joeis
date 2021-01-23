package irvine.oeis.a000;

import irvine.math.ReducedLatinRectangles;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000576 a(n) is the number of (n-2) X n normalized Latin rectangles.
 * @author Sean A. Irvine
 */
public class A000576 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    return new ReducedLatinRectangles(++mN, mN - 2).count();
  }
}
