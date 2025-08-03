package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A386441 Triangle, read by rows, formed by reading Pascal's triangle (A007318) mod 27.
 * @author Sean A. Irvine
 */
public class A386441 extends A007318 {

  private static final Z Z27 = Z.valueOf(27);

  @Override
  public Z next() {
    return super.next().mod(Z27);
  }
}

