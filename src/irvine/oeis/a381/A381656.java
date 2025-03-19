package irvine.oeis.a381;

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A381656 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A381656 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A381656() {
    super(0, Zeta.zeta(3).square().multiply(3).subtract(Zeta.zeta(6).multiply(203).divide(48)));
  }
}
