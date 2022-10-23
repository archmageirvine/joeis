package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028929 Numbers represented by quadratic form with Gram matrix [ 4, 1; 1, 6 ], divided by 2.
 * @author Sean A. Irvine
 */
public class A028929 extends Sequence1 {

  private final TreeSet<Z> mForms = new TreeSet<>();
  private long mX = 0;
  private Z mX2 = Z.ZERO;

  {
    mForms.add(Z.ZERO);
  }

  @Override
  public Z next() {
    while (mX2.compareTo(mForms.first()) <= 0) {
      mX2 = Z.valueOf(++mX).square().multiply2();
      for (long y = 0; y <= mX; ++y) {
        final Z y2 = Z.valueOf(y).square();
        final Z r = mX2.add(y2.multiply(3));
        final Z s = Z.valueOf(mX).multiply(y);
        mForms.add(r.add(s));
        mForms.add(r.subtract(s));
        final Z t = y2.multiply2().add(Z.valueOf(mX).square().multiply(3));
        mForms.add(t.add(s));
        mForms.add(t.subtract(s));
      }
    }
    return mForms.pollFirst();
  }
}
