package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086278 Decimal expansion of Shapiro's cyclic sum constant mu.
 * @author Sean A. Irvine
 */
public class A086278 extends DecimalExpansionSequence {

  private static final UnaryCrFunction B = new UnaryCrFunction() {
    @Override
    public CR execute(final CR c) {
      final CR expc = c.divide(2).exp();
      return c.exp().multiply(2).add(c.multiply(3).divide(2).exp()).subtract(expc)
        .divide(expc.add(1).square()).log();
    }
  };

  private static final CR A = B.execute(new UnaryCrFunction() {
    @Override
    public CR execute(final CR c) {
      final CR bc = B.execute(c);
      return bc.exp().multiply(c.subtract(bc).add(1))
        .add(1)
        .multiply(c.divide(2).exp().add(1))
        .subtract(c.exp().add(1).multiply(2));
    }
  }.inverseMonotone(CR.NEG_ONE, CR.ONE).execute(CR.ZERO));

  /** Construct the sequence. */
  public A086278() {
    super(0, A.exp().multiply(CR.ONE.subtract(A)).add(1).divide(2));
  }
}
