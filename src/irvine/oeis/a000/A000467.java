package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a008.A008304;

/**
 * A000467.
 * @author Sean A. Irvine
 */
public class A000467 extends A008304 {

  @Override
  public Z next() {
    return i(++mN, 6);
  }
}

