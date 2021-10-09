package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A073742 Decimal expansion of sinh(1).
 * @author Sean A. Irvine
 */
public class A073742 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A073742() {
    super(REALS.sinh(CR.ONE));
  }
}
