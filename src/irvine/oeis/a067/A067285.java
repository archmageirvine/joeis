package irvine.oeis.a067;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A067285 a(n) = smallest integer k such that k is not of the form m + reverse(m) for any m (cf. A067031) and A067030(n) occurs in the 'Reverse and Add' trajectory of k.
 * @author Sean A. Irvine
 */
public class A067285 extends A067030 {

  private final Sequence mS = new A067031();
  private Z mPrev = mS.next();
  private final List<Z> mB = new ArrayList<>();
  private final List<Z> mA = new ArrayList<>();
  {
    mA.add(mPrev);
    mB.add(mPrev);
  }

  @Override
  public Z next() {
    Z k = super.next();
    if (k.isZero()) {
      return Z.ZERO;
    }
    while (k.compareTo(mPrev) >= 0) {
      mPrev = mS.next();
      mA.add(mPrev);
      mB.add(mPrev);
    }
    for (int j = 0; j < mA.size(); ++j) {
      Z t = mA.get(j);
      int c;
      while ((c = t.compareTo(k)) <= 0) {
        if (c == 0) {
          return mB.get(j);
        }
        final Z r = ZUtils.reverse(t);
        t = t.add(r);
        mA.set(j, t);
      }
    }
    throw new RuntimeException(); // should never happen
  }
}
