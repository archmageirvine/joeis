package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a003.A003509;

/**
 * A005991.
 * @author Sean A. Irvine
 */
public class A005991 extends A003509 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
