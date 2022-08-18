package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019685 Decimal expansion of Pi/180.
 * @author Sean A. Irvine
 */
public class A019685 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019685() {
    super(0, CR.PI.divide(CR.valueOf(180)));
  }
}
