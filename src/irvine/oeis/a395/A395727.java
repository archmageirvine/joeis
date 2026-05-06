package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A084713.
 * @author Sean A. Irvine
 */
public class A395727 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395727() {
    super(0, CR.PI.multiply(3).divide(10).tan().multiply(2).divide(3));
  }
}
