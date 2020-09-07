package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A034850 Triangular array formed by taking every other term of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A034850 extends A007318 {

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}
