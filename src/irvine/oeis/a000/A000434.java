package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a008.A008304;

/**
 * A000434.
 * @author Sean A. Irvine
 */
public class A000434 extends A008304 {

  @Override
  public Z next() {
    return i(++mN, 4);
  }
}

