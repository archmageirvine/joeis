package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a125.A125790;

/**
 * A002575 Coefficients of Bell's formula for making change.
 * @author Sean A. Irvine
 */
public class A002575 extends A125790 {

  // Conjectured ...

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, 2L);
  }
}
