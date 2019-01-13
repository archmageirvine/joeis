package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a002.A002306;

/**
 * A047817.
 * @author Sean A. Irvine
 */
public class A047817 extends A002306 {

  private int mN = 0;

  @Override
  public Z next() {
    return hurwitz(++mN).den();
  }
}
