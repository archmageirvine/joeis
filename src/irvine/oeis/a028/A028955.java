package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028955 Numbers represented by quadratic form with Gram matrix [ 4, 1; 1, 4 ] (divided by 2).
 * @author Sean A. Irvine
 */
public class A028955 implements Sequence {

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
      final Z w = mX2.multiply2();
      for (long y = 0; y <= mX; ++y) {
        final Z y2 = Z.valueOf(y).square().multiply2();
        final Z r = w.add(y2);
        final Z s = Z.valueOf(mX).multiply(y);
        mForms.add(r.add(s));
        mForms.add(r.subtract(s));
      }
    }
    return mForms.pollFirst();
  }
}
