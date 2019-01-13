package irvine.oeis.a001;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001857.
 * @author Sean A. Irvine
 */
public class A001857 implements Sequence {

  private final ArrayList<Z> mSeq = new ArrayList<>();
  private final TreeMap<Z, Boolean> mSums = new TreeMap<>();

  @Override
  public Z next() {
    final int n = mSeq.size();
    if (n == 0) {
      mSeq.add(Z.TWO);
    } else if (n == 1) {
      mSeq.add(Z.THREE);
      mSums.put(Z.FIVE, Boolean.FALSE);
    } else {
      while (true) {
        final Map.Entry<Z, Boolean> e = mSums.pollFirstEntry();
        if (!e.getValue()) {
          final Z t = e.getKey();
          for (final Z a : mSeq) {
            final Z b = t.add(a);
            mSums.put(b, mSums.containsKey(b));
          }
          mSeq.add(t);
          break;
        }
      }
    }
    return mSeq.get(n);
  }
}
