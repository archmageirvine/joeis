package irvine.oeis.a067;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A067287 n sets a new record for the number of integers k such that k is not of the form m + reverse(m) for any m and n occurs in the 'Reverse and Add' trajectory of k (cf. A067284).
 * @author Sean A. Irvine
 */
public class A067287 extends A067030 {

  private final Sequence mS = new A067031();
  private Z mPrev = mS.next();
  private final List<Z> mA = new ArrayList<>();
  private long mMax = 1;
  {
    mA.add(mPrev);
  }

  @Override
  public Z next() {
    while (true) {
      final Z k = super.next();
      if (k.isZero()) {
        return Z.ZERO;
      }
      while (k.compareTo(mPrev) >= 0) {
        mPrev = mS.next();
        mA.add(mPrev);
      }
      long cnt = 0;
      for (int j = 0; j < mA.size(); ++j) {
        Z t = mA.get(j);
        int c;
        while ((c = t.compareTo(k)) <= 0) {
          if (c == 0) {
            ++cnt;
          }
          final Z r = ZUtils.reverse(t);
          t = t.add(r);
          mA.set(j, t);
        }
      }
      if (cnt > mMax) {
        mMax = cnt;
        return k;
      }
    }
  }
}
