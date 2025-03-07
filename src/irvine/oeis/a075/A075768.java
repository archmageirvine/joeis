package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;
import irvine.util.string.StringUtils;

/**
 * A075768.
 * @author Sean A. Irvine
 */
public class A075768 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final HashSet<Pair<Z, Z>> mWallisPairs = new HashSet<>();
  private Z mN = Z.THREE;
  private long mCount = 0;

  private boolean isIndecomposable(final Pair<Z, Z> w) {
    final Z x0 = w.left();
    final Z y0 = w.right();
    for (final Pair<Z, Z> u : mWallisPairs) {
      final Z x = u.left();
      final Z y = u.right();
      if (x0.mod(x).isZero() && y0.mod(y).isZero()) {
        final Z a = x0.divide(x);
        final Z b = y0.divide(y);
        if (Functions.SIGMA1.z(a.square()).equals(Functions.SIGMA1.z(b.square()))) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mCount > 0) {
      --mCount;
      return mN;
    }
    while (true) {
      mN = mN.add(1);
      final Z ns = mN.square();
      final Z sigma = Functions.SIGMA1.z(ns);
      final Set<Z> invSigma = InverseSigma.inverseSigma(sigma, 1);
      mCount = 0;
      for (final Z t : invSigma) {
        if (t.compareTo(ns) > 0 && Predicates.SQUARE.is(t)) {
          final Z y = t.sqrt();
          final Pair<Z, Z> w = new Pair<>(mN, y);
          if (isIndecomposable(w)) {
            if (mVerbose) {
              StringUtils.message("(" + mN + "," + y + ")");
            }
            mWallisPairs.add(w);
            ++mCount;
          }
        }
      }
      if (mCount > 0) {
        --mCount;
        return mN;
      }
    }
  }
}
