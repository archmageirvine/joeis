package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a008.A008292;

/**
 * A065826 Triangle with T(n,k) = k*E(n,k) where E(n,k) are Eulerian numbers A008292.
 * @author Sean A. Irvine
 */
public class A065826 extends A008292 {

  @Override
  public Z next() {
    return super.next().multiply(mM);
  }
}

