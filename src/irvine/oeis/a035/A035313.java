package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035313 (Largest) diagonal of the Zorach additive triangle A035312.
 * @author Sean A. Irvine
 */
public class A035313 extends A035312 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
