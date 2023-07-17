package irvine.oeis.a013;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A013924 Number of labeled connected graphs with n nodes and 2 cutpoints.
 * @author Sean A. Irvine
 */
public class A013924 extends MemoryFunction2Sequence<Integer, Z> {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A013924(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A013924() {
    super(4);
  }

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private final MemorySequence mB = MemorySequence.cachedSequence(new PrependSequence(new A013922(), 0));

  // [x^m z^n]{(\PhiS(x,z))}^q=\sum_{j,k}[x^j z^k]\Phi S(x,z)[x^{m-j}z^{n-k}]{(\Phi S(x,z))}^{q-1}
  // Not particularly efficient
  private Q coeffSmnq(final int m, final int n, final int q) {
    assert q >= 1;
    if (q == 1) {
      return new Q(get(m, n).multiply(m).add(get(m - 1, n).multiply(n - m + 1)), mF.factorial(n));
    }
    Q u = Q.ZERO;
    for (int k = 1; k < n; ++k) {
      for (int j = 1; j < m; ++j) {
        final Q t = coeffSmnq(j, k, 1).multiply(coeffSmnq(m - j, n - k, q - 1));
        u = u.add(t);
      }
    }
    return u;
  }

  @Override
  protected Z compute(final Integer m, final Integer n) {
    if (m == 0) {
      return mB.a(n);
    }
    if (n.equals(m)) {
      return Z.ZERO;
    }
    Q smn = Q.ZERO;
    for (int k = 2; k <= n - m; ++k) {
      Q t = Q.ZERO;
      for (int q = 1; q <= Math.min(k - 1, m); ++q) {
        final Q u = coeffSmnq(m, n + q - k, q)
          .divide(mF.factorial(q))
          .divide(mF.factorial(k - 1 - q));
        t = t.add(u);
      }
      smn = smn.add(t.multiply(mB.a(k)));
    }
    return smn.multiply(mF.factorial(n)).divide(n - m).toZ();
  }

  private int mN = 3;

  @Override
  public Z next() {
    return get(2, ++mN);
  }
}
