package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a008.A008441;

/**
 * A005883.
 * @author Sean A. Irvine
 */
public class A005883 extends A008441 {

  @Override
  public Z next() {
    return super.next().multiply(4);
  }
}
