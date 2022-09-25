package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059439 A diagonal of A059438.
 * @author Sean A. Irvine
 */
public class A059439 extends A059438 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, 2);
  }
}
