package irvine.oeis.a084;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084039 a(1) = 1; then distinct numbers such that both the product of two successive terms + 1 and the ratio of the larger to the smaller of two successive terms + 1 is a prime.
 * @author Sean A. Irvine
 */
public class A084039 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = null;

  private boolean is(final Z x, final Z y) {
    return x.multiply(y).add(1).isProbablePrime() && x.divide(y).add(1).isProbablePrime();
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      mUsed.add(Z.ONE);
      return Z.ONE;
    }
    for (final Z d : Jaguar.factor(mA).divisorsSorted()) {
      if (!mUsed.contains(d) && is(mA, d)) {
        mA = d;
        mUsed.add(mA);
        return mA;
      }
    }
    Z t = mA;
    while (true) {
      t = t.add(mA);
      if (!mUsed.contains(t) && is(t, mA)) {
        mA = t;
        mUsed.add(mA);
        return mA;
      }
    }
  }
}

