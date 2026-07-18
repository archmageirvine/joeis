package irvine.oeis.a085;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a025.A025487;

/**
 * A085988 Triangle of least prime signatures such that T(1,1)= 1; T(r,j) = 2*T(r,j-1) for j&gt;1 and T(r+1,1) is the smallest value in A025487 not appearing on an earlier row.
 * @author Sean A. Irvine
 */
public class A085988 extends Sequence1 {

  private final Sequence mA = new A025487();
  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mPrev = null;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      do {
        mPrev = mA.next();
      } while (!mSeen.add(mPrev));
      return mPrev;
    }
    mPrev = mPrev.multiply2();
    mSeen.add(mPrev);
    return mPrev;
  }
}
