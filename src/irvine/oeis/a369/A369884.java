package irvine.oeis.a369;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A054263.
 * @author Sean A. Irvine
 */
public class A369884 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A369884() {
    super(1, CR.PI.square().divide(CR.valueOf(12)).add(CR.LOG2.square().divide(CR.TWO)));
  }
}
