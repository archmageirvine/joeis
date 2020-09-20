package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A034932 Pascal's triangle read modulo 16.
 * @author Sean A. Irvine
 */
public class A034932 extends A007318 {

  private static final Z Z16 = Z.valueOf(16);

  @Override
  public Z next() {
    return super.next().mod(Z16);
  }
}

