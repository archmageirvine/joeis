package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026662.
 * @author Sean A. Irvine
 */
public class A026662 extends A026659 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
