package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a037.A037040;

/**
 * A038377 Number of odd nonprimes &lt;= (2n+1)^2.
 * @author Sean A. Irvine
 */
public class A038377 extends A037040 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
