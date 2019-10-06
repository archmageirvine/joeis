package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026521.
 * @author Sean A. Irvine
 */
public class A026521 extends A026519 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN - 1);
  }
}
