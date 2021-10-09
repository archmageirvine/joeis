package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A073747 Decimal expansion of coth(1).
 * @author Sean A. Irvine
 */
public class A073747 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A073747() {
    super(REALS.coth(CR.ONE));
  }
}
