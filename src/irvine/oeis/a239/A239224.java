package irvine.oeis.a239;
// manually 2025-06-12/ratos at 2025-06-12 22:14

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.recur.RationalRecurrence;

/**
 * A239224 Numerator of 2n/v(n)^2, where v(1) = 0, v(2) = 1, and v(n) = v(n-1)/(n-2) + v(n-2) for n &gt;= 3; limit of 2n/v(n)^2 is Pi.
 * ZV(2*n)./(term.^(2))
 * @author Georg Fischer
 */
public class A239224 extends RationalRecurrence {

  protected int mN;

  /** Construct the sequence. */
  public A239224() {
    super(1, "[[0],[-2,1],[1],[2,-1]", "1,1,1", 0, 0);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = Q.valueOf(mN * 2L).divide(nextQ().square()).num();
    return mN == 1 ? Z.ONE : result;
  }
}
