package irvine.oeis.a001;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001857 a(1)=2, a(2)=3; for n &gt;= 3, a(n) is smallest number that is uniquely of the form a(j) + a(k) with 1 &lt;= j &lt; k &lt; n.
 * @author Sean A. Irvine
 */
public class A001857 extends Sequence1 {

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
