package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A034931 Pascal's triangle read modulo 4.
 * @author Sean A. Irvine
 */
public class A034931 extends A007318 {

  @Override
  public Z next() {
    return super.next().mod(Z.FOUR);
  }
}

