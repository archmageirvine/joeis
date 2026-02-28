package irvine.oeis.a390;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A390125 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A390125 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A390125() {
    super(1, CR.PI.square().divide(4).subtract(CR.PI.multiply(ComputableReals.SINGLETON.atan(CR.E.inverse()))));
  }
}
