package irvine.oeis.a001;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001857 <code>a(1)=2, a(2)=3</code>; for <code>n &gt;= 3, a(n)</code> is smallest number that is uniquely of the form a(j) + a(k) with <code>1 &lt;=</code> j &lt; k <code>&lt; n</code>.
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
