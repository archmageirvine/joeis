package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a008.A008443;

/**
 * A005878.
 * @author Sean A. Irvine
 */
public class A005878 extends A008443 {

  @Override
  public Z next() {
    return super.next().multiply(8);
  }
}
