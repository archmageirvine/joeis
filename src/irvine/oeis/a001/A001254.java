package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A001254 Squares of Lucas numbers.
 * @author Sean A. Irvine
 */
public class A001254 extends A000032 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
