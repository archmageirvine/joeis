package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a225.A225923;

/**
 * A002292.
 * @author Sean A. Irvine
 */
public class A002292 extends A225923 {

  @Override
  public Z next() {
    return super.next().abs();
  }
}
