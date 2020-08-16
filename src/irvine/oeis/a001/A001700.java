package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001700 <code>a(n) = binomial(2*n+1, n+1)</code>: number of ways to put <code>n+1</code> indistinguishable balls into <code>n+1</code> distinguishable boxes = number of <code>(n+1)-st</code> degree monomials in <code>n+1</code> variables = number of monotone maps from <code>1..n+1</code> to <code>1..n+1</code>.
 * @author Sean A. Irvine
 */
public class A001700 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN + 1, mN + 1);
  }
}
