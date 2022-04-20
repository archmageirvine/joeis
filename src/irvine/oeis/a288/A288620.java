package irvine.oeis.a288;

import irvine.factor.factor.Cheetah;
import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.math.MemoryFunction;
import irvine.math.group.IntegersModMul;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A288620 Triangle read by rows: T(n,k) = number of step shifted (decimated) sequence structures of length n using exactly k different symbols.
 * @author Sean A. Irvine
 */
public class A288620 extends MemoryFunction<Integer, CycleIndex> implements Sequence {

  private int mN = 0;
  private int mM = 0;

  private final MemoryFunction<Integer, CycleIndex> mS = new MemoryFunction<Integer, CycleIndex>() {
    @Override
    protected CycleIndex compute(final Integer key) {
      return SymmetricGroup.create(key).cycleIndex();
    }
  };

  // Z(H_n)
  @Override
  protected CycleIndex compute(final Integer n) {
    final CycleIndex ci = new CycleIndex("H(" + n + ")");
    for (int k = 1; k <= n; ++k) {
      if (IntegerUtils.gcd(k, n) == 1) {
        final MultivariateMonomial mm = new MultivariateMonomial();
        for (final Z dd : Cheetah.factor(n).divisors()) {
          final int ord = new IntegersModMul(dd).order(Z.valueOf(k)).intValueExact();
          mm.add(ord, Euler.phi(dd).divide(ord));
        }
        ci.add(mm);
      }
    }
    ci.multiply(new Q(1, LongUtils.phi(n)));
    return ci;
  }

  protected Z t(final int n, final int m) {
    final Z v = getValue(n).deBruijn(mS.getValue(m));
    return m == 1 ? v : v.subtract(getValue(n).deBruijn(mS.getValue(m - 1)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
