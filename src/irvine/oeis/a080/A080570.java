package irvine.oeis.a080;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080570 Number of 1's in partition of n-th Ulam number into sum of two distinct Ulam numbers.
 * @author Sean A. Irvine
 */
public class A080570 extends Sequence1 {

  private final ArrayList<Z> mSeq = new ArrayList<>();
  private final ArrayList<Long> mCountOfOnes = new ArrayList<>();
  private final TreeMap<Z, Long> mSums = new TreeMap<>();
  private final HashSet<Z> mNotUnique = new HashSet<>();

  @Override
  public Z next() {
    if (mSeq.isEmpty()) {
      final Z a1 = Z.ONE;
      mSeq.add(a1);
      mCountOfOnes.add(1L);
      return Z.ONE;
    }
    if (mSeq.size() == 1) {
      final Z a2 = Z.TWO;
      mSeq.add(a2);
      mCountOfOnes.add(0L);
      mSums.put(a2.add(Z.ONE), 1L);
      return Z.ZERO;
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
        if (mSums.put(s, next.getValue() + mCountOfOnes.get(k)) != null) {
          mNotUnique.add(s);
        }
      }
      mSeq.add(next.getKey());
      mCountOfOnes.add(next.getValue());
      return Z.valueOf(next.getValue());
    }
  }
}
