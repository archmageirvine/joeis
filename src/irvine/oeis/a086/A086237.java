
package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086993.
 * @author Sean A. Irvine
 */
public class A086237 extends DecimalExpansionSequence {

  private static final CR PI2 = CR.PI.square();

  /** Construct the sequence. */
  public A086237() {
    super(1, CR.LOG2.multiply(6).divide(PI2).multiply(CR.LOG2.multiply(3).add(CR.GAMMA.multiply(4)).subtract(CR.valueOf(24).divide(PI2).multiply(CrFunctions.ZETA_PRIME.cr(2))).subtract(2)).subtract(CR.HALF));
  }
}

