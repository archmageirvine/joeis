package irvine.oeis.a263;
// Generated by gen_seq4.pl 2024-08-02.ack/decexp at 2024-08-02 23:54

import irvine.math.cr.CR;
import irvine.oeis.a006.A006752;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A263353 Decimal expansion of the generalized hypergeometric function 3F2(1/2,1/2,1/2; 3/2,3/2; x) at x=1/2.
 * Formula:
 * @author Georg Fischer
 */
public class A263353 extends DecimalExpansionSequence {

  private static final DecimalExpansionSequence A006752 = new A006752();

  /** Construct the sequence */
  public A263353() {
    super(1, CR.PI.multiply(CR.TWO.log()).divide(4).add(A006752.getCR()).divide(CR.SQRT2));
  }
}
