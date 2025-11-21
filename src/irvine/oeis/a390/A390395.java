package irvine.oeis.a390;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390395 a(n) is the size of the maximum size of a subset S of {1,...,n} such that there are no solutions to 1/a = 1/b + 1/c for distinct a,b,c in S.
 * @author Sean A. Irvine
 */
public class A390395 extends Sequence1 {

  private final List<BitSet> mS = new ArrayList<>();
  {
    mS.add(new BitSet());
  }
  private int mN = 0;
  private int mMax = 0;

  private boolean is(final BitSet s, final Q t) {
    for (int k = s.nextSetBit(0); k >= 0; k = s.nextSetBit(k + 1)) {
      final Q v = t.add(new Q(1, k));
      if (v.num().isOne() && s.get(v.den().intValueExact())) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final Q t = new Q(1, ++mN);
    final List<BitSet> next = new ArrayList<>();
    for (final BitSet s : mS) {
      if (is(s, t)) {
        final BitSet c = (BitSet) s.clone();
        c.set(mN);
        if (c.cardinality() > mMax) {
          mMax = c.cardinality();
        }
        next.add(c);
      }
    }
    mS.addAll(next);
    return Z.valueOf(mMax);
  }
}
