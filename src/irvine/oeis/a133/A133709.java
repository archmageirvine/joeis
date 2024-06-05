package irvine.oeis.a133;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A133709 Triangle read by rows: T(m,l) = number of labeled covers of size l of a finite set of m unlabeled elements (m &gt;= 1, 1 &lt;= l &lt;= 2^m - 1).
 * @author Sean A. Irvine
 */
public class A133709 extends MemoryFunction2Sequence<Integer, Z> {

  /** Construct the sequence. */
  public A133709() {
    super(1);
  }

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
      sum = sum.subtract(Functions.STIRLING2.z(l, i).multiply(get(m, i)));
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
