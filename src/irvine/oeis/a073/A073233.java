package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A073233 Decimal expansion of Pi^Pi.
 * @author Sean A. Irvine
 */
public class A073233 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A073233() {
    super(2, REALS.pow(CR.PI, CR.PI));
  }
}
