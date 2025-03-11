package irvine.oeis.a381;

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A381651 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A381651 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A381651() {
    super(0, Zeta.zeta(5).multiply(2).subtract(Zeta.zeta(2).multiply(Zeta.zeta(3))));
  }
}
