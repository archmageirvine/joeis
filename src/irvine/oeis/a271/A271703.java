package irvine.oeis.a271;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A271703 Triangle read by rows: the unsigned Lah numbers T(n,k) = binomial(n-1, k-1)*n!/k! if n &gt; 0 and k &gt; 0, T(n,0) = 0^n and otherwise 0, for n &gt;= 0 and 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A271703 implements Sequence {

  protected int mN = -1;
  protected int mM = 0;

  protected Z t(final int n, final int m) {
    if (m == 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    return Binomial.binomial(n - 1, m - 1).multiply(MemoryFactorial.SINGLETON.factorial(n)).divide(MemoryFactorial.SINGLETON.factorial(m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
