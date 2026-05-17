package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395756 allocated for Kelvin Voskuijl.
 * @author Sean A. Irvine
 */
public class A395756 extends DecimalExpansionSequence {

  private static final CR C1 = CR.valueOf(new Q(2, 7));

  /** Construct the sequence. */
  public A395756() {
    super(1, CrFunctions.BESSEL_I.cr(new Q(-5, 7), C1.sqrt().multiply(2)).multiply(CrFunctions.GAMMA.cr(C1)).multiply(C1.pow(new Q(5, 14))));
  }
}
