package irvine.oeis.a228;

import java.util.ArrayList;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a033.A033678;
import irvine.oeis.transform.BellMatrixTransformSequence;

/**
 * A228550 Triangular array read by rows: T(n,k) is the number of simple labeled graphs with n vertices and k components such that each vertex has even degree; n &gt;= 1, 1 &lt;= k &lt;= n.
 * @author Gregory Morse
 */
public class A228550 extends Sequence1 {
  private final ArrayList<Z> mCounts = new ArrayList<>();
  private final A033678 mConnected = new A033678();
  private final BellMatrixTransformSequence mBell = new BellMatrixTransformSequence(mCounts);
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mCounts.add(mConnected.next());
    }
    return mBell.get(mN, mM);
  }
}
