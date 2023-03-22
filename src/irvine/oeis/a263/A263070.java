package irvine.oeis.a263;

import irvine.math.z.Z;
import irvine.oeis.a262.A262809;

/**
 * A062204.
 * @author Sean A. Irvine
 */
public class A263070 extends A262809 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 10);
  }
}

