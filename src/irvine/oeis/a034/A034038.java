package irvine.oeis.a034;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034038 Imprimitively represented by (x^2+xy+2y^2, x&gt;=0, y&gt;=0).
 * @author Sean A. Irvine
 */
public class A034038 extends Sequence0 {

  private final TreeSet<Z> mForms = new TreeSet<>();
  private long mX = 0;
  private Z mX2 = Z.ZERO;

  {
    mForms.add(Z.FOUR);
  }

  @Override
  public Z next() {
    while (mX2.compareTo(mForms.first()) <= 0) {
      mX2 = Z.valueOf(++mX).square();
      for (long y = 0; y <= mX; ++y) {
        if (Functions.GCD.l(y, mX) != 1) {
          final Z y2 = Z.valueOf(y).square();
          final Z r = mX2.add(y2.multiply2());
          final Z s = Z.valueOf(mX).multiply(y);
          mForms.add(r.add(s));
          final Z t = y2.add(Z.valueOf(mX).square().multiply2());
          mForms.add(t.add(s));
        }
      }
    }
    return mForms.pollFirst();
  }
}
