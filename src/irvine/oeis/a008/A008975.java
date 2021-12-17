package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A008975 Triangle, read by rows, formed by reading Pascal's triangle (A007318) mod 10.
 * @author Sean A. Irvine
 */
public class A008975 extends A007318 {

  @Override
  public Z next() {
    return super.next().mod(Z.TEN);
  }
}
