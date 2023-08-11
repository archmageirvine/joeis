package irvine.oeis.a005;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a001.A001037;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A005597 Decimal expansion of the twin prime constant C_2 = Product_{ p prime &gt;= 3 } (1-1/(p-1)^2).
 * @author Sean A. Irvine
 */
public class A005597 extends DecimalExpansionSequence {

  private static final MemorySequence S = MemorySequence.cachedSequence(new A001037());

  private static final MemoryFunction1<CR> INTERMEDIATES = new MemoryFunction1<>() {
    @Override
    protected CR compute(final int n) {
      if (n <= 1) {
        return CR.ONE;
      }
      return Zeta.zeta(n).multiply(CR.ONE.subtract(CR.valueOf(Z.ONE.shiftLeft(n)).inverse())).log().multiply(S.a(n));
    }
  };

  /** Construct the sequence. */
  public A005597() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int opPrec = -precision;
        Z sum = Z.ZERO;
        int k = 1;
        while (true) {
          final Z t = INTERMEDIATES.get(++k).getApprox(-opPrec);
          if (t.isZero()) {
            break;
          }
          sum = sum.add(t);
        }
        return sum.negate();
      }
    }.exp());
  }
}
