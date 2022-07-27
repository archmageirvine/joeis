package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a055.A055512;

/**
 * A058164 Number of labeled lattices with a fixed bottom.
 * @author Sean A. Irvine
 */
public class A058164 extends A055512 {

  @Override
  public Z next() {
    if (mN < 0) {
      super.next();
    }
    return super.next().divide(mN);
  }
}
