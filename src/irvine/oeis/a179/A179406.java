package irvine.oeis.a179;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A179406 Conjectured records d such that for all nonsquare x &gt; A179407(n), all positive differences x^5-y^2 exceed d.
 * @author Sean A. Irvine
 */
public class A179406 extends Sequence1 {

  private static final long HEURISTIC = 10;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final TreeMap<Z, Long> mA = new TreeMap<>();
  private Z mPrev = Z.ZERO;
  private long mN = 1;

  protected Z select(final Map.Entry<Z, Long> e) {
    if (mVerbose) {
      StringUtils.message("Putative solution: " + e.getKey() + " = " + e.getValue() + "^5 + " + Z.valueOf(e.getValue()).pow(5).sqrt() + "^2");
    }
    return e.getKey();
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.firstEntry().getValue() * HEURISTIC > mN) {
      if (!Predicates.SQUARE.is(++mN)) {
        final Z x5 = Z.valueOf(mN).pow(5);
        final Z y = x5.sqrt();
        final Z d = x5.subtract(y.square());
        if (!d.isZero()) {
          mA.tailMap(d).clear(); // Remove all larger results
          mA.put(d, mN);
        }
      }
    }
    final Map.Entry<Z, Long> e = mA.pollFirstEntry();
    final Z d = e.getKey();
    if (d.compareTo(mPrev) < 0) {
      throw new RuntimeException("Heuristic failed terms already output larger than " + d + " were incorrect");
    }
    mPrev = d;
    return select(e);
  }
}

