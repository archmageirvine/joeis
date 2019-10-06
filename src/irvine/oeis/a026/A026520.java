package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026520.
 * @author Sean A. Irvine
 */
public class A026520 extends A026519 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
