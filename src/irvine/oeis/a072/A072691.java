package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A072691 Decimal expansion of Pi^2/12.
 * @author Sean A. Irvine
 */
public class A072691 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A072691() {
    super(0, CR.PI.multiply(CR.PI).divide(CR.valueOf(12)));
  }
}
