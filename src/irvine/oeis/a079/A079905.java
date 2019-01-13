package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a007.A007378;

/**
 * A079905.
 * @author Sean A. Irvine
 */
public class A079905 extends A007378 {

  @Override
  public Z next() {
    return super.next().subtract(size() == 1 ? 2 : 1);
  }
}
