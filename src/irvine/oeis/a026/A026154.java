package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026154.
 * @author Sean A. Irvine
 */
public class A026154 extends A026148 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN - 3);
  }
}
