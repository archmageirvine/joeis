package irvine.oeis.a133;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A133709 Triangle read by rows: <code>T(m,l) =</code> number of labeled covers of size l of a finite set of m unlabeled elements <code>(m &gt;= 1, 1 &lt;= l &lt;= 2^m - 1)</code>.
 * @author Sean A. Irvine
 */
public class A133709 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mN = 0;
  private int mL = 0;

  @Override
  protected Z compute(final Integer m, final Integer l) {
    if (l == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int i = 0; i < l; ++i) {
      sum = sum.signedAdd((i & 1) == 0, Binomial.binomial(l, i).multiply(Binomial.binomial((1L << (l - i)) + m - 2, m)));
    }
    for (int i = 1; i < l; ++i) {
      sum = sum.subtract(Stirling.secondKind(l, i).multiply(get(m, i)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mL >= 1 << mN) {
      ++mN;
      mL = 1;
    }
    return get(mN, mL);
  }
}
