package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000055;

/**
 * A001256.
 * @author Sean A. Irvine
 */
public class A001256 extends A000055 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
