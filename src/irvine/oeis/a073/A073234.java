package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073234 Decimal expansion of Pi^(Pi^Pi).
 * @author Sean A. Irvine
 */
public class A073234 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A073234() {
    super(CR.PI.pow(CR.PI.pow(CR.PI)));
  }
}
