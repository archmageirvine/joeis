package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086277 Decimal expansion of Shapiro's cyclic sum constant lambda.
 * @author Sean A. Irvine
 */
public class A086277 extends DecimalExpansionSequence {

  private static final UnaryCrFunction C = new UnaryCrFunction() {
    @Override
    public CR execute(final CR x) {
      final CR c = x.divide(2).exp();
      return x.add(c.divide(c.add(x.exp().multiply(2))));
    }
  };

  private static final CR A = C.execute(new UnaryCrFunction() {
    @Override
    public CR execute(final CR x) {
      final CR c = C.execute(x);
      return c.negate().exp().multiply(c.add(1).subtract(x))
        .subtract(CR.TWO.divide(x.exp().add(x.divide(2).exp())));
    }
  }.inverseMonotone(CR.valueOf(-2), CR.TWO).execute(CR.ZERO));

  /** Construct the sequence. */
  public A086277() {
    super(0, A.negate().exp().multiply(A.add(1)).divide(2));
  }
}
