package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a002.A002491;

/**
 * A007952.
 * @author Sean A. Irvine
 */
public class A007952 extends A002491 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
