package irvine.oeis.a071;

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000961;

/**
 * A071328.
 * @author Sean A. Irvine
 */
public class A071330 extends Sequence1 {

  private final DirectSequence mPP = DirectSequence.forceCreate(1, new A000961());
  private final TreeMap<Z, Integer> mCounts = new TreeMap<>();
  private int mM = 0;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    while (mPP.a(mM).compareTo(mN) < 0) {
      for (int k = 0; k <= mM; ++k) {
        mCounts.merge(mPP.a(mM).add(mPP.a(k)), 1, Integer::sum);
      }
      ++mM;
    }
    final Integer res = mCounts.remove(mN);
    return res == null ? Z.ZERO : Z.valueOf(res);
  }
}
