package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A008953.
 * @author Sean A. Irvine
 */
public class A008953 extends A000217 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(super.next().toString().charAt(0) - '0');
  }
}
