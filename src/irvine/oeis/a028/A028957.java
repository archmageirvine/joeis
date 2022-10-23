package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028957 Numbers represented by quadratic form with Gram matrix [ 2, 1; 1, 8 ] (divided by 2).
 * @author Sean A. Irvine
 */
public class A028957 extends Sequence1 {

  private final TreeSet<Z> mForms = new TreeSet<>();
  private long mX = 0;
  private Z mX2 = Z.ZERO;

  {
    mForms.add(Z.ZERO);
  }

  @Override
  public Z next() {
    while (mX2.compareTo(mForms.first()) <= 0) {
      mX2 = Z.valueOf(++mX).square();
      final Z w = mX2.multiply(4);
      for (long y = 0; y <= mX; ++y) {
        final Z y2 = Z.valueOf(y).square();
        final Z r = w.add(y2);
        final Z s = Z.valueOf(mX).multiply(y);
        mForms.add(r.add(s));
        mForms.add(r.subtract(s));
        final Z t = y2.multiply(4).add(mX2);
        mForms.add(t.add(s));
        mForms.add(t.subtract(s));
      }
    }
    return mForms.pollFirst();
  }
}
