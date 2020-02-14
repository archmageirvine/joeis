package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028927 Numbers represented by quadratic form with Gram matrix <code>[ 3, 1; 1, 5 ]</code>.
 * @author Sean A. Irvine
 */
public class A028927 implements Sequence {

  // 3x^2 + 5y^2 +/- 2xy, with x >= 0, y >= 0

  private final TreeSet<Z> mForms = new TreeSet<>();
  private long mX = 0;
  private Z mX2x3 = Z.ZERO;

  {
    mForms.add(Z.ZERO);
  }

  @Override
  public Z next() {
    while (mX2x3.compareTo(mForms.first()) <= 0) {
      mX2x3 = Z.valueOf(++mX).square().multiply(3);
      for (long y = 0; y <= mX; ++y) {
        final Z y2 = Z.valueOf(y).square();
        final Z r = mX2x3.add(y2.multiply(5));
        final Z s = Z.valueOf(mX).multiply(y).multiply2();
        mForms.add(r.add(s));
        mForms.add(r.subtract(s));
        final Z t = y2.multiply(3).add(Z.valueOf(mX).square().multiply(5));
        mForms.add(t.add(s));
        mForms.add(t.subtract(s));
      }
    }
    return mForms.pollFirst();
  }
}
