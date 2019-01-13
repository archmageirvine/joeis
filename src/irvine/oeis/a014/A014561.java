package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a007.A007811;

/**
 * A014561.
 * @author Sean A. Irvine
 */
public class A014561 extends A007811 {

  @Override
  public Z next() {
    return super.next().subtract(1).divide(3);
  }
}
