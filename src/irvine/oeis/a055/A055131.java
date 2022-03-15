package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a005.A005098;

/**
 * A055131 Those composite s for which A055095[s] = 2.
 * @author Sean A. Irvine
 */
public class A055131 extends A005098 {

  @Override
  public Z next() {
    return super.next().multiply(4).add(1).multiply(3);
  }
}
