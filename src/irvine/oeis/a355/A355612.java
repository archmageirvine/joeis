package irvine.oeis.a355;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a003.A003024;
import irvine.oeis.a003.A003030;
import irvine.oeis.transform.BellMatrixTransformSequence;

/**
 * A355612 Number of labeled digraphs on [n] such that for any pair C_1,C_2 of distinct strongly connected components, if x in C_1 is directed to y in C_2 then every vertex in C_1 is directed to every vertex in C_2.
 * @author Gregory Morse
 */
public class A355612 extends Sequence0 {
  private final DirectSequence mDag = DirectSequence.create(new A003024());
  private final DirectSequence mStrong = DirectSequence.create(new A003030());
  private final ArrayList<Z> mCounts = new ArrayList<>();
  private final BellMatrixTransformSequence mBell = new BellMatrixTransformSequence(mCounts);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mCounts.add(mStrong.a(mN));
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(mDag.a(k).multiply(mBell.get(mN, k)));
    }
    return sum;
  }
}
