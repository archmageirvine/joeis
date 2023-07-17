package irvine.oeis.a058;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A058876 Triangle read by rows: T(n,k) = number of labeled acyclic digraphs with n nodes, containing exactly n+1-k points of in-degree zero (n &gt;= 1, 1&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A058876 extends MemoryFunction2Sequence<Integer, Z> {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A058876(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A058876() {
    super(1);
  }

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final Integer p, final Integer k) {
    if (p.equals(k)) {
      return Z.ONE;
    }
    final Z u = Z.ONE.shiftLeft(k).subtract(1);
    Z v = u;
    Z s = Z.ZERO;
    for (int j = 1; j <= p - k; ++j, v = v.multiply(u)) {
      s = s.add(Binomial.binomial(p, k).multiply(get(p - k, j)).multiply(v).shiftLeft(k * (p - j - k)));
    }
    return s;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mN - mM);
  }

}
