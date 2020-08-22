package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026676 a(n) = T(n, floor(n/2)), T given by A026670.
 * @author Sean A. Irvine
 */
public class A026676 extends A026670 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
