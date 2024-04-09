package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A014473 Pascal's triangle - 1: Triangle read by rows: T(n, k) = A007318(n, k) - 1.
 * @author Sean A. Irvine
 */
public class A014473 extends A007318 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
