package irvine.oeis.a348;

import irvine.math.z.Z;

/**
 * A348161.
 * @author Sean A. Irvine
 */
public class A348161 extends A348157 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}
