package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a008.A008970;

/**
 * A000506.
 * @author Sean A. Irvine
 */
public class A000506 extends A008970 {

  private int mN = 4;

  @Override
  public Z next() {
    return get(++mN, 5).divide(2);
  }
}
