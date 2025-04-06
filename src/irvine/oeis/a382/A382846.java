package irvine.oeis.a382;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016627.
 * @author Sean A. Irvine
 */
public class A382846 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A382846() {
    super(0, CR.FOUR.subtract(CR.PI.square().divide(4)).subtract(CR.FOUR.log()));
  }
}
