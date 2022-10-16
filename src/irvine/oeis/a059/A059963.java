package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059963 Triangle T(n,k) giving number of ways of placing n nonattacking queens on n X n board with the queen on the first row fixed at column k, 1&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A059963 implements Sequence {

  // A simple backtracking implementation.
  // Don't expect to break any records using this :-)

  private int mN = 0;
  private int mM = 0;

  protected boolean isConsistent(final int[] q, final int n) {
    for (int k = 0; k < n; ++k) {
      if (q[k] == q[n]) {
        return false;   // same column
      }
      if (q[k] - q[n] == n - k) {
        return false;   // same major diagonal
      }
      if (q[n] - q[k] == n - k) {
        return false;   // same minor diagonal
      }
    }
    return true;
  }

  /**
   * Can be used by subclasses to determine if this solution should be counted,
   * and if so, with what multiplicity.
   * @param q the solution
   * @return count for this solution
   */
  protected Z count(final int[] q) {
    return Z.ONE;
  }

  protected Z count(final int[] q, final int n) {
    Z c;
    if (n == q.length) {
      c = count(q);
    } else {
      c = Z.ZERO;
      for (int k = 0; k < q.length; ++k) {
        q[n] = k;
        if (isConsistent(q, n)) {
          c = c.add(count(q, n + 1));
        }
      }
    }
    return c;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    final int[] q = new int[mN];
    q[0] = mM;
    return count(q, 1);
  }
}
