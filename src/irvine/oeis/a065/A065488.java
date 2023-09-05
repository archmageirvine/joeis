package irvine.oeis.a065;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.a006.A006206;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.memory.MemorySequence;

/**
 * A065488 Decimal expansion of Product_{p prime} (1 + 1/(p^2-p-1)).
 * @author Sean A. Irvine
 */
public class A065488 extends DecimalExpansionSequence {

  private static final MemorySequence S = MemorySequence.cachedSequence(new A006206());

  private static final MemoryFunction1<CR> INTERMEDIATES = new MemoryFunction1<>() {
    @Override
    protected CR compute(final int n) {
      if (n <= 1) {
        return CR.ZERO;
      }
      return Zeta.zeta(n).pow(CR.valueOf(S.a(n - 1)));
    }
  };

  /** Construct the sequence. */
  public A065488() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int opPrec = -precision;
        Z prod = Z.ONE.shiftLeft(opPrec);
        int k = 1;
        while (true) {
          final Z zeta = INTERMEDIATES.get(++k).getApprox(-opPrec);
          final Z prev = prod;
          prod = prod.multiply(zeta).shiftRight(opPrec);
          if (prod.equals(prev)) {
            break;
          }
        }
        return prod;
      }
    });
    setOffset(1);
  }
}
