package irvine.oeis.a265;

import java.util.ArrayList;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.BellTransform;
import irvine.oeis.Sequence;

/**
 * A265607.
 * @author Sean A. Irvine
 */
public class A265607 implements Sequence {

  private int mN = -1;
  private int mM = 0;
  private Z mF = Z.ONE;
  private BellTransform mBellTransform = null;

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      return Z.ONE;
    }
    if (++mM > mN) {
      ++mN;
      final ArrayList<Q> invNat = new ArrayList<>();
      invNat.add(Q.ZERO);
      for (int k = 1; k <= mN; ++k) {
        invNat.add(new Q(1, k));
      }
      mM = 0;
      mBellTransform = new BellTransform(invNat);
      mF = mF.multiply(mN);
    }
    return mBellTransform.get(mN, mM).multiply(mF).toZ();
  }
}
