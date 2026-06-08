package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085205.
 * @author Sean A. Irvine
 */
public class A395230 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395230() {
    super(1, CrFunctions.GAMMA.cr(new Q(7, 6)).pow(3).multiply(16).divide(CR.SQRT_PI));
  }
}
