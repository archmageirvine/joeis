package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A001246.
 * @author Sean A. Irvine
 */
public class A001246 extends A000108 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
