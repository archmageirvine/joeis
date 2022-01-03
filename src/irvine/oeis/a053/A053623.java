package irvine.oeis.a053;

import java.util.LinkedList;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053619.
 * @author Sean A. Irvine
 */
public class A053623 implements Sequence {

  private long mN = 0;
  private long mCount = 0;
  private TreeSet<Long> mSeen = new TreeSet<>();

  private void search() {
    final LinkedList<Long> extensions = new LinkedList<>();
    for (long k = 1; k <= mN; ++k) {
      if (!mSeen.contains(k)) {
        boolean extendable = true;
        for (final long v : mSeen) {
          if ((v & k) == v) {
            extendable = false;
            break;
          }
        }
        if (extendable) {
          extensions.add(k);
        }
      }
    }
    if (extensions.isEmpty()) {
      ++mCount;
    } else {
      for (final long e : extensions) {
        mSeen.add(e);
        search();
        mSeen.remove(e);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    mSeen.clear();
    search();
    return Z.valueOf(mCount);
  }
}
