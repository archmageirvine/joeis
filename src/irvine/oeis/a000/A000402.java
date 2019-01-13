package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a008.A008304;

/**
 * A000402.
 * @author Sean A. Irvine
 */
public class A000402 extends A008304 {

  @Override
  public Z next() {
    return i(++mN, 3);
  }
}

