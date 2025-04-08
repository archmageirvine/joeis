package irvine.oeis.a382;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A382846 Decimal expansion of 4 - Pi^2/4 - 2*log(2).
 * @author Sean A. Irvine
 */
public class A382846 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A382846() {
    super(0, CR.FOUR.subtract(CR.PI.square().divide(4)).subtract(CR.FOUR.log()));
  }
}
