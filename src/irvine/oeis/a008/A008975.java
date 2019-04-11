package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A008975 Pascal's triangle <code>mod 10</code>.
 * @author Sean A. Irvine
 */
public class A008975 extends A007318 {

  @Override
  public Z next() {
    return super.next().mod(Z.TEN);
  }
}
