package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026161.
 * @author Sean A. Irvine
 */
public class A026161 extends A026148 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 1);
  }
}
