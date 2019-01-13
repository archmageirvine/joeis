package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a003.A003422;

/**
 * A014288.
 * @author Sean A. Irvine
 */
public class A014288 extends A003422 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
