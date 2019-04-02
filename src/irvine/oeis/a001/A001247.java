package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000110;

/**
 * A001247 Squares of Bell numbers.
 * @author Sean A. Irvine
 */
public class A001247 extends A000110 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
