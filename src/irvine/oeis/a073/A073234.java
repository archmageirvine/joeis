package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;
import irvine.math.cr.ComputableReals;

/**
 * A073234 Decimal expansion of Pi^(Pi^Pi).
 * @author Sean A. Irvine
 */
public class A073234 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI, REALS.pow(CR.PI, CR.PI));

  /** Construct the sequence. */
  public A073234() {
    super(false);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
