package irvine.oeis.a049;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A049541 Decimal expansion of 1/Pi.
 * @author Sean A. Irvine
 */
public class A049541 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A049541() {
    super(CR.PI.inverse());
  }
}
