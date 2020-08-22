package irvine.oeis.a136;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A136413 a(1)=1. a(n+1) = a(n) + (number of terms of this sequence that are &lt;= (1/n)sum{k=1 to n} a(k)).
 * @author Sean A. Irvine
 */
public class A136413 implements Sequence {

  private int mN = 0;
  private Z mSum = Z.ZERO;
  private final ArrayList<Z> mPrev = new ArrayList<>();

  @Override
  public Z next() {
    if (++mN == 1) {
      mPrev.add(Z.ZERO);
      mPrev.add(Z.ONE);
    } else {
      int c = 0;
      final Z lim = mSum.divide(mN - 1);
      for (int k = 1; k < mPrev.size(); ++k) {
        if (lim.compareTo(mPrev.get(k)) >= 0) {
          ++c;
        }
      }
      mPrev.add(mPrev.get(mN - 1).add(c));
    }
    final Z r = mPrev.get(mN);
    mSum = mSum.add(r);
    return r;
  }
}
