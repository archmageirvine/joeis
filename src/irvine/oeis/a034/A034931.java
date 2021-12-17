package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A034931 Triangle, read by rows, formed by reading Pascal's triangle (A007318) mod 4.
 * @author Sean A. Irvine
 */
public class A034931 extends A007318 {

  @Override
  public Z next() {
    return super.next().mod(Z.FOUR);
  }
}

