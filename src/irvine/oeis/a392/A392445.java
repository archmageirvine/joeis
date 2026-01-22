package irvine.oeis.a392;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.Pair;

/**
 * A392445 Irregular triangle read by rows: T(n, k) is the number of factorizations of n into k factors (where 0 &lt; k &lt;= Omega(n)) that are inequivalent under toroidal symmetry.
 * @author Sean A. Irvine
 */
public class A392445 extends Sequence2 {

  // After Marko Riedel

  protected final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int q, final int r) {
      if (n == 1) {
        return Z.ZERO;
      }
      final long m = (long) q * r;
      if (Z.ONE.shiftLeft(m).compareTo(n) > 0) {
        return Z.ZERO;
      }
      final FactorSequence fs = Jaguar.factor(n);
      Z res = Z.ZERO;
      for (final Z dd : Jaguar.factor(q).divisors()) {
        final int d = dd.intValue();
        for (final Z ff : Jaguar.factor(r).divisors()) {
          final int f = ff.intValue();
          final int cyclen = Functions.LCM.i(d, f);
          final int cycpow = Functions.GCD.i(d, f);
          final int cycpairs = (q / d) * (r / f);
          final int expon = cycpow * cycpairs;
          final List<Pair<Integer, Integer>> nroot = new ArrayList<>();
          for (final Z p : fs.toZArray()) {
            final int k = fs.getExponent(p);
            if (k % cyclen > 0) {
              break;
            }
            nroot.add(new Pair<>(p.intValue(), k / cyclen));
          }
          if (nroot.size() < fs.omega()) {
            continue;
          }
          Z interm = Z.ZERO;
          for (int j = 1; j <= expon; ++j) {
            final int fj = j;
            final Z bigF = Integers.SINGLETON.product(0, nroot.size() - 1, i -> Binomial.binomial(nroot.get(i).right() + fj - 1, fj - 1));
            interm = interm.add(Binomial.binomial(expon, j).multiply(Z.NEG_ONE.pow(expon - j)).multiply(bigF));
          }
          res = res.add(interm.multiply(Functions.PHI.l(d)).multiply(Functions.PHI.l(f)));
        }
      }
      return res.divide(q).divide(r);
    }
  };

  private int mN = 1;
  private int mM = 0;

  @Override
  public Z next() {
    while (true) {
      ++mM;
      final Z t = Integers.SINGLETON.sumdiv(mM, d -> mB.get(mN, d, mM / d));
      if (!t.isZero()) {
        return t;
      }
      ++mN;
      mM = 0;
    }
  }
}
