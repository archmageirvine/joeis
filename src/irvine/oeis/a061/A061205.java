package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a004.A004086;

/**
 * A061200.
 * @author Sean A. Irvine
 */
public class A061205 extends A004086 {

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}
