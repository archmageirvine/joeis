package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000283;

/**
 * A014253.
 * @author Sean A. Irvine
 */
public class A014253 extends A000283 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
