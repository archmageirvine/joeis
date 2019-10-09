package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026664.
 * @author Sean A. Irvine
 */
public class A026664 extends A026659 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 2);
  }
}
