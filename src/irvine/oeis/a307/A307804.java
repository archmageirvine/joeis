package irvine.oeis.a307;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a123.A123543;
import irvine.oeis.transform.BellMatrixTransformSequence;

/**
 * A307804 Triangle T(n,k) read by rows: number of labeled 2-regular digraphs (multiple arcs and loops allowed) on n nodes with k components.
 * @author Gregory Morse
 */
public class A307804 extends Sequence0 {
  private final ArrayList<Z> mCounts = new ArrayList<>();
  private final Sequence mConnected = new A123543().skip();
  private final BellMatrixTransformSequence mBell = new BellMatrixTransformSequence(mCounts);
  private int mN = -1;
  private int mK = 0;

  @Override
  public Z next() {
    if (++mK > mN) {
      if (++mN > 0) {
        mCounts.add(mConnected.next());
      }
      mK = 0;
    }
    return mBell.get(mN, mK);
  }
}
