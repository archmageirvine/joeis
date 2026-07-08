package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a083.A083061;

/**
 * A085734 Triangle read by rows: T(0,0) = 1, T(n,k) = Sum_{j=max(0,1-k)..n-k} (2^j)*(binomial(k+j,1+j) + binomial(k+j+1,1+j))*T(n-1,k-1+j).
 * @author Sean A. Irvine
 */
public class A085734 extends A083061 {

  @Override
  public Z next() {
    return super.next().shiftLeft(mN - mM);
  }
}
