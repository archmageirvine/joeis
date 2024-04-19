package irvine.oeis.a053;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053623 Number of distinct non-extendable sequences (x(1),x(2),...,x(k)) such that each x(i) is in {1,2,...,n} and (x(j) AND x(i)) &lt;&gt; x(j) for i=2..k, j=1..i-1.
 * @author Sean A. Irvine
 */
public class A053623 extends Sequence1 {

  private long mN = 0;
  private long mCount = 0;
  private final TreeSet<Long> mSeen = new TreeSet<>();

  private void search() {
    boolean foundExtension = false;
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
          foundExtension = true;
          mSeen.add(k);
          search();
          mSeen.remove(k);
        }
      }
    }
    if (!foundExtension) {
      ++mCount;
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
