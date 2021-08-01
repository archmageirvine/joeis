package irvine.oeis.a205;

import irvine.math.z.Z;
import irvine.oeis.a070.A070885;

/**
 * A205083 Parity of A070885.
 * @author Sean A. Irvine
 */
public class A205083 extends A070885 {

  @Override
  public Z next() {
    return super.next().and(Z.ONE);
  }
}
