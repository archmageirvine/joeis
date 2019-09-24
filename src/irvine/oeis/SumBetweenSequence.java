package irvine.oeis;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.a026.A026276;

/**
 * Assuming a sequence where each positive integer appears twice, compute the
 * sum of all terms between each number.
 * @author Sean A. Irvine
 */
public class SumBetweenSequence extends A026276 {

  private final Sequence mS;
  private final TreeMap<Long, Z> mDone = new TreeMap<>();
  private TreeMap<Long, Z> mInProgress = new TreeMap<>();
  private long mN = 0;

  /**
   * Sum between sequence.
   * @param seq underlying sequence
   */
  public SumBetweenSequence(final Sequence seq) {
    mS = seq;
  }

  @Override
  public Z next() {
    ++mN;
    while (!mDone.containsKey(mN)) {
      final long t = mS.next().longValueExact();
      final TreeMap<Long, Z> next = new TreeMap<>();
      for (Map.Entry<Long, Z> e : mInProgress.entrySet()) {
        if (e.getKey() == t) {
          mDone.put(e.getKey(), e.getValue());
        } else {
          next.put(e.getKey(), e.getValue().add(t));
        }
      }
      if (!mInProgress.containsKey(t)) {
        next.put(t, Z.ZERO);
      }
      mInProgress = next;
    }
    return mDone.pollFirstEntry().getValue();
  }
}
