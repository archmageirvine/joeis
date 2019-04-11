package irvine.oeis.a173;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A173018 Euler's triangle: triangle of Eulerian numbers T(n,k) <code>(n&gt;=0, 0 &lt;= k &lt;= n)</code> read by rows.
 * @author Sean A. Irvine
 */
public class A173018 extends MemoryFunction2<Integer, Z> implements Sequence {

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
  public Z next() {
    if (++mP > mN) {
      ++mN;
      mP = 0;
    }
    return get(mN, mP);
  }
}

