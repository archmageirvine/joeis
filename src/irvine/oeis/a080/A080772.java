package irvine.oeis.a080;

import irvine.math.MemoryFunctionInt2;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080772 Numbers of numbers &lt;= n having prime factors &lt;= k, triangular array read by rows.
 * @author Sean A. Irvine
 */
public class A080772 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      return n == m ? Z.valueOf(n) : Predicates.PRIME.is(m + 1) ? Z.valueOf(m) : get(n, m + 1);
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, mM);
  }
}
