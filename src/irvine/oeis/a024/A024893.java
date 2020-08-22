package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a003.A003627;

/**
 * A024893 Numbers n such that 3*n+2 is prime.
 * @author Sean A. Irvine
 */
public class A024893 extends A003627 {

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}
