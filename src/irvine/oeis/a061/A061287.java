package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A061281.
 * @author Sean A. Irvine
 */
public class A061287 extends A000045 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
