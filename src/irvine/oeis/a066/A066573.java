package irvine.oeis.a066;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.function.Function;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunction;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A066573.
 * @author Sean A. Irvine
 */
public class A066573 extends Sequence1 {

  private final TreeSet<Pair<Z, Z>> mPairs = new TreeSet<>(Comparator.comparing((Function<Pair<Z, Z>, Z>) Pair::right).thenComparing(Pair::left));
  private Z mRight = null;
  private Z mN = Z.ZERO;
  private Z mM = Z.ZERO;
  private final HashMap<Z, TreeSet<Z>> mFInverse = new HashMap<>();
  private final MemoryFunction<Z, Z> mF = new MemoryFunction<>() {
    @Override
    protected Z compute(final Z n) {
      return CR.valueOf(n).sin().multiply(n).abs().floor();
    }
  };

  protected Z fInverse(final Z n) {
    return n.subtract(1);
  }

  private Z d(final Z n) {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (!d.equals(n)) {
        sum = sum.add(mF.getValue(d));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (mRight != null) {
      // If we are already outputting a pair, then output the right half
      final Z r = mRight;
      mRight = null;
      return r;
    }
    while (mPairs.isEmpty()) {
      mN = mN.add(1);
      final Z d = d(mN);
      while (d.compareTo(mM) >= 0) {
        mM = mM.add(1);
        final Z f = mF.getValue(mM);
        final TreeSet<Z> t = mFInverse.get(f);
        if (t != null) {
          t.add(mM);
        } else {
          final TreeSet<Z> r = new TreeSet<>();
          r.add(mM);
          mFInverse.put(f, r);
        }
      }
      final TreeSet<Z> g = mFInverse.get(d);
      if (g != null) {
        final Z u = mF.getValue(mN);
        for (final Z t : g) {
          if (t.compareTo(mN) < 0 && d(t).equals(u)) {
            mPairs.add(new Pair<>(t, mN)); // We do this in case it is possible for more than 1 pair to occur
          }
        }
      }
    }
    final Pair<Z, Z> ret = mPairs.pollFirst();
    mRight = ret.right();
    return ret.left();
  }
}
