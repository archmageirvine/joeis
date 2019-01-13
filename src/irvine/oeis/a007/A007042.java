package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A007042.
 * @author Sean A. Irvine
 */
public class A007042 extends A000041 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(2);
  }
}
