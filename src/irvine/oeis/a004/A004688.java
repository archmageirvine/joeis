package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A004688.
 * @author Sean A. Irvine
 */
public class A004688 extends A000045 {

  @Override
  public Z next() {
    return new Z(super.next().toString(5));
  }
}

