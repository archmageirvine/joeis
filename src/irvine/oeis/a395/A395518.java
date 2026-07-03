package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.util.array.DynamicArray;

/**
 * A395518 allocated for Alejandro Radisic.
 * @author Sean A. Irvine
 */
public class A395518 extends DecimalExpansionSequence {

  private static final int EXTRA_PRECISION = 32;

  /** Construct the sequence. */
  public A395518() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final DynamicArray<Z> coeff = new DynamicArray<>();
        coeff.set(0, Z.ONE);

        int p = 1;
        Z s = CR.ONE.getApprox(precision);
        while (true) {
          p = Functions.NEXT_PRIME.i(p);
          final int oldDegree = coeff.length() - 1;
          for (int i = 0; i < p; ++i) {
            coeff.set(coeff.length(), Z.ZERO);
          }

          Z delta = Z.ZERO;
          for (int k = oldDegree; k >= 0; --k) {
            final Z ck = coeff.get(k);
            final long d = k + p + 1;
            final Z t = ck.abs().shiftLeft(EXTRA_PRECISION - precision).add(d / 2).divide(d);
            delta = delta.signedAdd(ck.signum() > 0, t);
            coeff.set(k + p, coeff.get(k + p).subtract(ck));
          }
          delta = delta.add(Z.ONE.shiftLeft(EXTRA_PRECISION - 1)).shiftRight(EXTRA_PRECISION);
          if (delta.isZero()) {
            return s;
          }
          s = s.subtract(delta);
        }
      }
    }, 10, 5);
  }
}
