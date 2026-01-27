package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A083437 Write decimal expansion of Pi in triangular form; sequence gives right edge.
 * @author Sean A. Irvine
 */
public class A083437 extends A000796 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (int k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}
