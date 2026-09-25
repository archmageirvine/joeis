package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a001.A001113;

/**
 * A086658 Write decimal expansion of e in triangular form; sequence gives left edge.
 * @author Sean A. Irvine
 */
public class A086658 extends A001113 {

  private int mN = -2;

  @Override
  public Z next() {
    ++mN;
    for (int k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}
