package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A028912 Sort digits of primes into descending order (A028906), sort this sequence into ascending order (A028911), then remove duplicates.
 * @author Sean A. Irvine
 */
public class A028912 extends A028906 {

  private final TreeSet<Z> mSet = new TreeSet<>();
  private int mLength = 0;
  private Z mPrev = super.next();

  @Override
  public Z next() {
    if (mSet.isEmpty()) {
      ++mLength;
      do {
        mSet.add(mPrev);
        mPrev = super.next();
      } while (mPrev.toString().length() <= mLength);
    }
    return mSet.pollFirst();
  }
}
