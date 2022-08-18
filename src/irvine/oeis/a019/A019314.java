package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019314 Decimal expansion of e^Pi + Pi^e.
 * @author Sean A. Irvine
 */
public class A019314 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019314() {
    super(2, CR.PI.exp().add(ComputableReals.SINGLETON.pow(CR.PI, CR.E)));
  }
}
