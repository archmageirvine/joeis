package irvine.oeis.a348;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A054263.
 * @author Sean A. Irvine
 */
public class A348373 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A348373() {
    super(1, CR.PI.square().divide(CR.SIX).add(CR.LOG2.square()));
  }
}
