package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A008975.
 * @author Sean A. Irvine
 */
public class A008975 extends A007318 {

  @Override
  public Z next() {
    return super.next().mod(Z.TEN);
  }
}
