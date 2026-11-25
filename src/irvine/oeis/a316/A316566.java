package irvine.oeis.a316;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import irvine.math.group.Gl2ElementOrders;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A316566 Triangle read by rows: T(n,k) is the number of elements of the group GL(2, Z(n)) with order k, 1 &lt;= k &lt;= A316565(n).
 * @author Sean A. Irvine
 */
public class A316566 extends Sequence1 {

  private final Gl2ElementOrders mOrders = new Gl2ElementOrders();
  private int mN = 0;
  private Z[] mRow = new Z[0];
  private int mM = 0;

  protected Z[] computeRow(final int n) {
    final Map<Z, Z> distribution = mOrders.distribution(n);
    final Z[] counts = new Z[Collections.max(distribution.keySet()).intValueExact()];
    Arrays.fill(counts, Z.ZERO);
    for (final Map.Entry<Z, Z> entry : distribution.entrySet()) {
      counts[entry.getKey().intValueExact() - 1] = entry.getValue();
    }
    return counts;
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mRow = computeRow(++mN);
      mM = 0;
    }
    return mRow[mM];
  }
}
