package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A014495 Central binomial coefficient <code>- 1</code>.
 * @author Sean A. Irvine
 */
public class A014495 extends A001405 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
