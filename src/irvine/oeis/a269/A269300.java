package irvine.oeis.a269;
// Generated by gen_seq4.pl decexp at 2021-07-25 17:16

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A269300 Leading term in the sifting limit for Buchstab's iteration sieve.
 * Formula: 2*exp(li(2)-gamma-1)/log(2)^2
 * @author Georg Fischer
 */
public class A269300 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A269300() {
    super(1, CR.TWO.multiply(CrFunctions.LI.cr(CR.TWO).subtract(CR.GAMMA).subtract(CR.ONE).exp()).divide(CR.TWO.log().pow(CR.TWO)));
  }
}
