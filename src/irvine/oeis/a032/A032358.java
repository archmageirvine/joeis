package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a003.A003434;

/**
 * A032358 Number of iterations of phi(n) needed to reach 2.
 * @author Sean A. Irvine
 */
public class A032358 extends A003434 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
