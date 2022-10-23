package irvine.oeis.a003;

import java.util.HashSet;
import java.util.Set;

import irvine.math.set.AbstractSet;
import irvine.math.set.FiniteSet;
import irvine.math.set.IntegerSet;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003102 Largest number divisible by all numbers &lt; its n-th root.
 * @author Sean A. Irvine
 */
public class A003102 extends Sequence1 {

  // After T. D. Noe, Mathematica

  private int mN = 0;
  private int mK = 1;
  private Z mLc = Z.ONE;

  private AbstractSet<Integer> range(final int r) {
    return r < 1 ? new FiniteSet<>() : new IntegerSet(1, r);
  }

  private boolean isZero(final Set<Long> set) {
    return set.size() == 1 && set.iterator().next() == 0;
  }

  @Override
  public Z next() {
    ++mN;
    Z good = Z.ZERO;
    while (true) {
      final int r = mLc.root(mN).intValueExact();
      final HashSet<Long> residues = new HashSet<>();
      for (final int v : range(r)) {
        residues.add(mLc.mod(v));
      }
      if (!isZero(residues)) {
        break;
      }
      ++mK;
      good = mLc;
      mLc = mLc.lcm(Z.valueOf(mK));
    }
    int m = 2;
    while (true) {
      final Z mg = good.multiply(m);
      final int r = mg.root(mN).intValueExact();
      final HashSet<Long> residues = new HashSet<>();
      for (final int v : range(r)) {
        residues.add(mg.mod(v));
      }
      if (!isZero(residues)) {
        break;
      }
      ++m;
    }
    return good.multiply(m - 1);
  }
}
