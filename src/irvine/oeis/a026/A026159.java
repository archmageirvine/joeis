package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026159.
 * @author Sean A. Irvine
 */
public class A026159 extends A026148 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(4 * ++mN, mN);
  }
}
