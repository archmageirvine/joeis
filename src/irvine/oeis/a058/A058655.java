package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.UnimplementedException;

/**
 * A058655 Decimal expansion of area under the curve 1/Gamma(x) from zero to infinity.
 * @author Sean A. Irvine
 */
public class A058655 extends Sequence1 {
  @Override
  public Z next() {
    throw new UnimplementedException();
  }
}

// The following implementation is way too slow to be useful
// I think the recursive mA with precision kills it

//public class A058655 extends DecimalExpansionSequence {
//
//  private static CR s(final int k) {
//    return k == 1 ? CR.GAMMA : Zeta.zeta(k);
//  }
//
//  private static final MemoryFunction1<CR> mA = new MemoryFunction1<>() {
//    @Override
//    protected CR compute(final int n) {
//      if (n <= 1) {
//        return CR.ONE;
//      }
//      StringUtils.message("Starting a(" + n + ")");
//      CR sum = CR.ZERO;
//      for (int j = 0; j < n - 1; ++j) {
//        sum = ComputableReals.SINGLETON.signedAdd((j & 1) == 0, sum, s(j + 1).multiply(get(n - 1 - j)));
//      }
//      StringUtils.message("Done a(" + n + ")");
//      return sum.divide(CR.valueOf(n - 1));
//    }
//  };
//
//  private static final BernoulliSequence mB = new BernoulliSequence(1);
//
//  private static final MemoryFunction1<CR> mC = new MemoryFunction1<>() {
//    @Override
//    protected CR compute(final int n) {
//      if (n == 0) {
//        return CR.ZERO;
//      }
//      return mA.get(2 * n - 1).multiply(mB.get(2L * n)).divide(CR.valueOf(2 * n));
//    }
//  };
//
//  /** Construct the sequence. */
//  public A058655() {
//    super(new CR() {
//      @Override
//      protected Z approximate(final int precision) {
//        Z sum = Z.ZERO;
//        int k = 0;
//        while (true) {
//          ++k;
//          if (k > 25) {
//            break; // temp this condition needs to be removed, but then it is too slow
//          }
//          final Z t = mC.get(k).getApprox(precision);
//          if (t.isZero()) {
//            break;
//          }
//          StringUtils.message(k + " " + sum + " " + t);
//          sum = sum.add(t);
//        }
//        return sum;
//      }
//    }.add(CR.E));
//  }
//}
