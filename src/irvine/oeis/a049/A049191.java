package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a001.A001388;

/**
 * A049191 Start with 1. Convert to base 3, describe it in base 3, convert to base 3.
 * @author Sean A. Irvine
 */
public class A049191 extends A001388 {

  @Override
  public Z next() {
    return new Z(super.next().toString(), 3);
  }
}

