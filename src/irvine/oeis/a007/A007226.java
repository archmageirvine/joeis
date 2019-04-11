package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007226 <code>a(n) =</code> 2*det(M(n,-1))/det(M(n, <code>0)),</code> where M(n,m) is the n X n matrix with element 1/binomial(n+i+j+m,n).
 * @author Sean A. Irvine
 */
public class A007226 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(3 * mN, mN).multiply2().subtract(Binomial.binomial(3 * mN, mN + 1));
  }
}
