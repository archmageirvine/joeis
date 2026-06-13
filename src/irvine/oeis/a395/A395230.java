package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395230 Decimal expansion of the volume of the supersphere |x|^6 + |y|^6 + |z|^6 = 1.
 * @author Sean A. Irvine
 */
public class A395230 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395230() {
    super(1, CrFunctions.GAMMA.cr(new Q(7, 6)).pow(3).multiply(16).divide(CR.SQRT_PI));
  }
}
