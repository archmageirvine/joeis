package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a001.A001387;

/**
 * A049190 Start with 1. Convert to base 2, describe it in base 2, convert to base 10.
 * @author Sean A. Irvine
 */
public class A049190 extends A001387 {

  @Override
  public Z next() {
    return new Z(super.next().toString(), 2);
  }
}

