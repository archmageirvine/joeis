package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a002.A002017;

/**
 * A007301 From expansion of exp(sin <code>x)</code>.
 * @author Sean A. Irvine
 */
public class A007301 extends A002017 {

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}
