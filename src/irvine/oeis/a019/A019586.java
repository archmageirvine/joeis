package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a003.A003603;

/**
 * A019586.
 * @author Sean A. Irvine
 */
public class A019586 extends A003603 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
