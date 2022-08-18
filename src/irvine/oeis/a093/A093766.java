package irvine.oeis.a093;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A093766 Decimal expansion of Pi/(2*sqrt(3)).
 * @author Sean A. Irvine
 */
public class A093766 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A093766() {
    super(0, CR.PI.divide(CR.valueOf(12).sqrt()));
  }
}
