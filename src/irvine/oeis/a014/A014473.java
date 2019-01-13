package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A014473.
 * @author Sean A. Irvine
 */
public class A014473 extends A007318 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
