package irvine.oeis.a225;

import java.util.ArrayList;

import irvine.math.z.Eulerian2;
import irvine.math.z.Z;
import irvine.oeis.BellMatrix;
import irvine.oeis.Sequence;

/**
 * A225171 Triangle read by rows: <code>T(n,k), 1 &lt;= k &lt;=</code> n, is the number of <code>non-degenerate fanout-free</code> Boolean functions of n variables having AND rank k.
 * @author Sean A. Irvine
 */
public class A225171 implements Sequence {

  private final ArrayList<Z> mA = new ArrayList<>();
  private final BellMatrix mB = new BellMatrix(mA);
  private int mN = 0;
  private int mK = 0;

  private Z eulerian2Sum(final int n) {
    if (n == 0) {
      return Z.TWO;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(Eulerian2.SINGLETON.get((long) n, (long) k).shiftLeft(2 * n - k));
    }
    return sum;
  }

  protected Z and(final int n, final int k) {
    while (n > mA.size()) {
      mA.add(eulerian2Sum(mA.size()));
    }
    return mB.get(n, k);
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 1;
    }
    return and(mN, mK);
  }
}
