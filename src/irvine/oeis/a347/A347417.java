package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A347417 allocated for Christoph B. Kassir.
 * @author Sean A. Irvine
 */
public class A347417 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347417() {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z product = one;
        long k = 0;
        while (true) {
          final Z t = CR.valueOf(--k).exp().getApprox(precision);
          if (t.isZero()) {
            break;
          }
          product = scale(product.multiply(t.add(one)), precision);
        }
        return product;
      }
    });
  }
}
