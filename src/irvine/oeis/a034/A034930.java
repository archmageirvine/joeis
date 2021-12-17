package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A034930 Triangle, read by rows, formed by reading Pascal's triangle (A007318) mod 8.
 * @author Sean A. Irvine
 */
public class A034930 extends A007318 {

  @Override
  public Z next() {
    return super.next().mod(Z.EIGHT);
  }
}

