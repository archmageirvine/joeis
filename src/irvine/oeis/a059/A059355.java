package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a008.A008826;

/**
 * A059355 A diagonal of triangle in A008826.
 * @author Sean A. Irvine
 */
public class A059355 extends A008826 {

  private int mN = 0;

  @Override
  public Z next() {
    return get(++mN + 2).get(mN);
  }
}
