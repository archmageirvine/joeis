package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000170 Number of ways of placing n nonattacking queens on an n X n board.
 * @author Sean A. Irvine
 */
public class A000170 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000170(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000170() {
    super(0);
  }

  // A simple backtracking implementation.
  // Don't expect to break any records using this :-)

  private int mN = -1;

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
    return count(new int[++mN], 0);
  }
}
