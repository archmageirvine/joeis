package irvine.oeis.a381;

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A381655 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A381655 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A381655() {
    super(0, Zeta.zeta(6).multiply(3).divide(4).subtract(Zeta.zeta(3).square().divide(2)));
  }
}
