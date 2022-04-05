package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a007.A007530;

/**
 * A064974 Numbers k such that k-1, k-3, k-7 and k-9 are all prime.
 * @author Sean A. Irvine
 */
public class A064974 extends A007530 {

  @Override
  public Z next() {
    return super.next().add(9);
  }
}
