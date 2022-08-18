package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A132700 Decimal expansion of Pi/31.
 * @author Sean A. Irvine
 */
public class A132700 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132700() {
    super(0, CR.PI.divide(CR.valueOf(31)));
  }
}
