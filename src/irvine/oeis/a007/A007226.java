package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007226 <code>a(n) = 2*det(M(n; -1))/det(M(n; 0))</code>, where <code>M(n; m)</code> is the <code>n X n</code> matrix with <code>(i,j)-th</code> element equal to <code>1/binomial(n + i + j +</code> m, <code>n)</code>.
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
