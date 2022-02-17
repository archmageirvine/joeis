package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054727 Number of forests of rooted trees with n nodes on a circle without crossing edges.
 * <code>seq(add(binomial(n, j-1) * binomial(3*n-2*j-1, n-j) / (2*n - j),j=1..n),n=1..20);</code>
 * @author Georg Fischer
 */
public class A054727 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, mN, j -> Binomial.binomial(mN, j - 1).multiply(Binomial.binomial(3 * mN - 2 * j - 1, mN - j)).divide(2 * mN - j));
  }
}
