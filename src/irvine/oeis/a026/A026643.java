package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026643 a(n) = A026637(n, floor(n/2)).
 * @author Sean A. Irvine
 */
public class A026643 extends A026637 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
