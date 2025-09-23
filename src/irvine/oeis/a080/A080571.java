package irvine.oeis.a080;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080571 Number of 2's in partition of n-th Ulam number into sum of two distinct Ulam numbers.
 * @author Sean A. Irvine
 */
public class A080571 extends Sequence1 {

  private final ArrayList<Z> mSeq = new ArrayList<>();
  private final ArrayList<Long> mCountOfTwos = new ArrayList<>();
  private final TreeMap<Z, Long> mSums = new TreeMap<>();
  private final HashSet<Z> mNotUnique = new HashSet<>();

  @Override
  public Z next() {
    if (mSeq.isEmpty()) {
      final Z a1 = Z.ONE;
      mSeq.add(a1);
      mCountOfTwos.add(0L);
      return Z.ZERO;
    }
    if (mSeq.size() == 1) {
      final Z a2 = Z.TWO;
      mSeq.add(a2);
      mCountOfTwos.add(1L);
      mSums.put(a2.add(Z.ONE), 1L);
      return Z.ONE;
    }
    final Z prev = mSeq.get(mSeq.size() - 1);
    while (true) {
      final Map.Entry<Z, Long> next = mSums.pollFirstEntry();
      if (next.getKey().compareTo(prev) <= 0 || mNotUnique.contains(next.getKey())) {
        mNotUnique.remove(next.getKey());
        continue;
      }
      for (int k = 0; k < mSeq.size(); ++k) {
        final Z s = mSeq.get(k).add(next.getKey());
        if (mSums.put(s, next.getValue() + mCountOfTwos.get(k)) != null) {
          mNotUnique.add(s);
        }
      }
      mSeq.add(next.getKey());
      mCountOfTwos.add(next.getValue());
      return Z.valueOf(next.getValue());
    }
  }
}
