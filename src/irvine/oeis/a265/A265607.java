package irvine.oeis.a265;

import java.util.ArrayList;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.transform.BellTransform;

/**
 * A265607 Triangle read by rows, T(n,k) = n!*B(n,k) for n&gt;=0 and 0&lt;=k&lt;=n, where B(n,k) is the Bell matrix with generator 1/j for j&gt;=1.
 * @author Sean A. Irvine
 */
public class A265607 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A265607(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A265607() {
    super(0);
  }

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
