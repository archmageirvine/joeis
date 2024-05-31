package irvine.oeis.a225;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.transform.BellMatrixTransformSequence;

/**
 * A225171 Triangle read by rows: T(n,k), 1 &lt;= k &lt;= n, is the number of non-degenerate fanout-free Boolean functions of n variables having AND rank k.
 * @author Sean A. Irvine
 */
public class A225171 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A225171(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A225171() {
    super(1);
  }

  private final ArrayList<Z> mA = new ArrayList<>();
  private final BellMatrixTransformSequence mB = new BellMatrixTransformSequence(mA);
  private int mN = 0;
  private int mK = 0;

  private Z eulerian2Sum(final int n) {
    if (n == 0) {
      return Z.TWO;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(Functions.EULERIAN2.z(n, k).shiftLeft(2L * n - k));
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
