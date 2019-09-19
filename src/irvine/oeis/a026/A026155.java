package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026155.
 * @author Sean A. Irvine
 */
public class A026155 extends A026148 {

  private long mN = 3;

  @Override
  public Z next() {
    return get(++mN, mN - 4);
  }
}
