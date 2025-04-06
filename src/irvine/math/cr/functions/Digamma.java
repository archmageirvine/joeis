package irvine.math.cr.functions;

import java.util.ArrayList;

import irvine.math.MemoryFunction;
import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * The digamma (psi) function.
 * @author Sean A. Irvine
 */
class Digamma extends CrFunction1 {

  private static final int EXTRA_PRECISION = 3;
  private static final int TOLERANCE = -32;

  @Override
  public CR cr(final CR x) {
    // -gamma - 1/z + z * sum_{k>=1} 1/(k*(z+k))
    // this convergence too slow
//    return new CR() {
//      @Override
//      protected Z approximate(final int precision) {
//        final int p = precision - EXTRA_PRECISION;
//        final Z x = z.getApprox(p);
//        final Z one = CR.ONE.getApprox(p);
//        Z j = Z.ZERO;
//        Z sum = Z.ZERO;
//        long k = 0;
//        while (true) {
//          final Z term = one.shiftLeft(-p).divide(x.add(j).multiply(++k));
//          //System.out.println("term=" + term);
//          if (term.isZero() || k > 1000) {
//            break;
//          }
//          sum = sum.add(term);
//          j = j.add(one);
//        }
//        return scale(sum, -EXTRA_PRECISION);
//      }
//    }.multiply(z.subtract(1)).subtract(CR.GAMMA);

    // Use recurrence to reduce z to range [0,2]
    CR y = x;
    CR add = CR.ZERO;
    while (y.compareTo(CR.TWO, TOLERANCE) >= 0) {
      y = y.subtract(1);
      add = add.add(y.inverse());
    }
    while (y.signum(TOLERANCE) < 0) {
      y = y.add(1);
      add = add.add(y.inverse());
    }
    final CR z = y; // final version

    // Expansion in terms of zeta, for z in [0,2]
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final CR z1 = z.subtract(1);
        Z sum = Z.ZERO;
        int k = 1;
        while (true) {
          final Z term = Zeta.zeta(++k).multiply(z1.pow(k - 1)).getApprox(p);
          if (term.isZero()) {
            return scale(sum, -EXTRA_PRECISION);
          }
          sum = sum.signedAdd((k & 1) == 0, term);
        }
      }
    }.subtract(CR.GAMMA).add(add);
  }

  private static final MemoryFunction<Integer, CR> SINGLETON = new MemoryFunction<>() {
    private final ArrayList<Q> mH = new ArrayList<>();
    private final HarmonicSequence mHarmonicSequence = new HarmonicSequence();

    private Q h(final int n) {
      while (n >= mH.size()) {
        mH.add(mHarmonicSequence.nextQ());
      }
      return mH.get(n);
    }

    @Override
    protected CR compute(final Integer n) {
      if (n <= 0) {
        throw new IllegalArgumentException();
      }
      if (n == 1) {
        return CR.GAMMA.negate();
      }
      return CR.valueOf(h(n - 2)).subtract(CR.GAMMA);
    }
  };

  @Override
  public CR cr(final Z z) {
    return SINGLETON.getValue(z.intValueExact());
  }
}
