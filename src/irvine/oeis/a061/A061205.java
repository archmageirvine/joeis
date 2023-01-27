package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a004.A004086;

/**
 * A061205 a(n) = n times R(n) where R(n) (A004086) is the digit reversal of n.
 * @author Sean A. Irvine
 */
public class A061205 extends A004086 {

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}
