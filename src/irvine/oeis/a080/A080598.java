package irvine.oeis.a080;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A080598 For numbers k such that A080570(k) and 2*A080571(k) are distinct Ulam numbers, sequence gives A002858(k).
 * @author Sean A. Irvine
 */
public class A080598 extends Sequence1 {

  private final ArrayList<Z> mSeq = new ArrayList<>();
  private final ArrayList<Long> mCountOfOnes = new ArrayList<>();
  private final ArrayList<Long> mCountOfTwos = new ArrayList<>();
  private final TreeMap<Z, Pair<Long, Long>> mSums = new TreeMap<>();
  private final HashSet<Z> mNotUnique = new HashSet<>();
  {
    final Z a1 = Z.ONE;
    mSeq.add(a1);
    mCountOfOnes.add(1L);
    mCountOfTwos.add(0L);
    final Z a2 = Z.TWO;
    mSeq.add(a2);
    mCountOfOnes.add(0L);
    mCountOfTwos.add(1L);
    mSums.put(a2.add(Z.ONE), new Pair<>(1L, 1L));
  }

  @Override
  public Z next() {
    while (true) {
      final Z prev = mSeq.get(mSeq.size() - 1);
      while (true) {
        final Map.Entry<Z, Pair<Long, Long>> next = mSums.pollFirstEntry();
        if (next.getKey().compareTo(prev) <= 0 || mNotUnique.contains(next.getKey())) {
          mNotUnique.remove(next.getKey());
          continue;
        }
        for (int k = 0; k < mSeq.size(); ++k) {
          final Z s = mSeq.get(k).add(next.getKey());
          if (mSums.put(s, new Pair<>(next.getValue().left() + mCountOfOnes.get(k), next.getValue().right() + mCountOfTwos.get(k))) != null) {
            mNotUnique.add(s);
          }
        }
        mSeq.add(next.getKey());
        mCountOfOnes.add(next.getValue().left());
        mCountOfTwos.add(next.getValue().right());
        if (next.getValue().left() != next.getValue().right() * 2 && mSeq.contains(Z.valueOf(next.getValue().left())) && mSeq.contains(Z.valueOf(next.getValue().right() * 2))) {
          return next.getKey();
        } else {
          break;
        }
      }
    }
  }
}
