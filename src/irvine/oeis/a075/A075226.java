package irvine.oeis.a075;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A075169.
 * @author Sean A. Irvine
 */
public class A075226 extends Sequence2 {

  // After Chai Wah Wu

  private int mN = 1;
  private Z mLcm = Z.ONE;

  private Z sumList(final List<Z> lst, final int pos) {
    return Integers.SINGLETON.sum(0, pos - 1, lst::get);
  }

  @Override
  public Z next() {
    mLcm = mLcm.lcm(++mN);
    Z c = Z.ZERO;
    final List<Z> mlist = new ArrayList<>();
    for (int k = 1; k <= mN; ++k) {
      mlist.add(mLcm.divide(k));
    }
    final Z lim = Z.ONE.shiftLeft(mN);
    for (int l = mN; l >= 0; --l) {
      if (sumList(mlist, l).compareTo(c) < 0) {
        break;
      }
      for (Z p = Z.ONE.shiftLeft(l).subtract(1); p.compareTo(lim) < 0; p = Functions.SWIZZLE.z(p)) {
        Z s = Z.ZERO;
        for (int k = 0; k < mN; ++k) {
          if (p.testBit(k)) {
            s = s.add(mlist.get(k));
          }
        }
        s = s.divide(Functions.GCD.z(s, mLcm));
        if (s.compareTo(c) > 0 && s.isProbablePrime()) {
          c = s;
        }
      }
    }
    return c;
  }
}
