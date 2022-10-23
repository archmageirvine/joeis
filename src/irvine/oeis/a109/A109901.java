package irvine.oeis.a109;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A109901 a(n) = binomial(n^2, n*(n+1)/2).
 * @author Georg Fischer
 */
public class A109901 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN * mN, mN * (mN + 1) / 2);
  }
}
