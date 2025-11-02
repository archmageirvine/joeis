package irvine.oeis.a173;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.oeis.triangle.DirectArray;

/**
 * A173018 Euler's triangle: triangle of Eulerian numbers T(n,k) (n&gt;=0, 0 &lt;= k &lt;= n) read by rows.
 * @author Sean A. Irvine
 */
public class A173018 extends MemoryFunction2Sequence<Integer, Z> implements DirectArray {

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (k == 0 && n >= 0) {
      return Z.ONE;
    } else if (k < 0 || k > n) {
      return Z.ZERO;
    } else {
      return get(n - 1, k - 1).multiply(n - k).add(get(n - 1, k).multiply(k + 1));
    }
  }

  private int mN = -1;
  private int mP = 0;

  @Override
  public Z a(final int n, final int k) {
    // T(n, k) = if(n==0, 1, sum(j=0, k+1, (-1)^(k-j+1)*binomial(n+1, k-j+1)*j^n)); 
    return n == 0 ? Z.ONE : Integers.SINGLETON.sum(0, k + 1, j -> Binomial.binomial(n + 1, k - j + 1).multiply(Z.valueOf(j).pow(n))
      .multiply(((k - j + 1) & 1) == 0 ? 1 : -1));
  }

  @Override
  public Z next() {
    if (++mP > mN) {
      ++mN;
      mP = 0;
    }
    return get(mN, mP);
  }
}

