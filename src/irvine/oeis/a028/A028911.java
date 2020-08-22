package irvine.oeis.a028;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;

/**
 * A028911 Sort digits of primes into descending order (A028906) then sort this sequence into ascending order.
 * @author Sean A. Irvine
 */
public class A028911 extends A028906 {

  private final List<Z> mList = new ArrayList<>();
  private int mLength = 0;
  private int mPos = -1;
  private Z mPrev = super.next();

  @Override
  public Z next() {
    if (++mPos >= mList.size()) {
      mList.clear();
      mPos = 0;
      ++mLength;
      do {
        mList.add(mPrev);
        mPrev = super.next();
      } while (mPrev.toString().length() <= mLength);
      Collections.sort(mList);
    }
    return mList.get(mPos);
  }
}
