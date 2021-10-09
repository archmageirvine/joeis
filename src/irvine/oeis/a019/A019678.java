package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019678 Decimal expansion of Pi/11.
 * @author Sean A. Irvine
 */
public class A019678 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019678() {
    super(CR.PI.divide(CR.valueOf(11)));
  }
}
