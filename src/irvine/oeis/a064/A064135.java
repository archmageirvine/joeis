package irvine.oeis.a064;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064135 Number of divisors of 10^n + 1 that are relatively prime to 10^m + 1 for all 0 &lt; m &lt; n.
 * @author Sean A. Irvine
 */
public class A064135 extends Sequence0 {

  private final ArrayList<Z> mPowersPlusOne = new ArrayList<>();
  private Z mPrev = Z.ONE;
  private int mN = -1;
  {
    mPowersPlusOne.add(Z.TWO);
  }

  private Z powerPlusOne(final int n) {
    // cache powers to avoid recomputing them multiple times
    while (n >= mPowersPlusOne.size()) {
      mPrev = mPrev.multiply(base());
      mPowersPlusOne.add(mPrev.add(1));
    }
    return mPowersPlusOne.get(n);
  }

  protected int base() {
    return 10;
  }

  @Override
  public Z next() {
    long c = 0;
    for (final Z d : Jaguar.factor(powerPlusOne(++mN)).divisors()) {
      boolean ok = true;
      for (int k = 1; k < mN; ++k) {
        if (!Z.ONE.equals(powerPlusOne(k).gcd(d))) {
          ok = false;
          break;
        }
      }
      if (ok) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

