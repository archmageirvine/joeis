package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059577 Main diagonal of the array A059574.
 * @author Sean A. Irvine
 */
public class A059577 extends A059513 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}

