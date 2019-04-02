package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A008459 Square the entries of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A008459 extends A007318 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

