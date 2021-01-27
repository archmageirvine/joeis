package irvine.oeis.a038;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a008.A008292;

/**
 * A038675 Triangle read by rows: T(n,k)=A(n,k)*binomial(n+k-1,n), where A(n,k) are the Eulerian numbers (A008292).
 * @author Sean A. Irvine
 */
public class A038675 extends A008292 {

  @Override
  public Z next() {
    return super.next().multiply(Binomial.binomial(mN + mM - 1, mN));
  }
}
