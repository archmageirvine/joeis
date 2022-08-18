package irvine.oeis.a090;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A090986 Decimal expansion of Pi/sinh(Pi).
 * @author Sean A. Irvine
 */
public class A090986 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A090986() {
    super(0, CR.PI.divide(REALS.sinh(CR.PI)));
  }
}
