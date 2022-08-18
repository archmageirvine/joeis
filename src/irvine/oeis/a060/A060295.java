package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A060295 Decimal expansion of exp(Pi*sqrt(163)).
 * @author Sean A. Irvine
 */
public class A060295 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A060295() {
    super(18, CR.PI.multiply(CR.valueOf(163).sqrt()).exp());
  }
}
