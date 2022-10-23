package irvine.oeis.a035;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035332 Smallest number not the concatenation of consecutive earlier terms.
 * @author Sean A. Irvine
 */
public class A035332 extends Sequence1 {

  private final TreeSet<Long> mForbidden = new TreeSet<>();
  private long mN = 0;
  private long mPrev = 0;

  @Override
  public Z next() {
    while (mForbidden.remove(++mN)) {
      // do nothing
    }
    if (mPrev != 0) {
      mForbidden.add(Long.valueOf(String.valueOf(mPrev) + mN));
    }
    mPrev = mN;
    return Z.valueOf(mN);
  }
}

