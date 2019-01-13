package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a003.A003557;

/**
 * A010848.
 * @author Sean A. Irvine
 */
public class A010848 extends A003557 {

  @Override
  public Z next() {
    return super.next().negate().add(mN);
  }
}
