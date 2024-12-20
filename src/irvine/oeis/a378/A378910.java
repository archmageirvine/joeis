package irvine.oeis.a378;
// Generated by gen_seq4.pl 2024-12-13.ack/decexp at 2024-12-13 23:43

import irvine.math.cr.CR;
import irvine.oeis.a006.A006752;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A378910 Decimal expansion of 2*G/Pi, where G = A006752.
 * Formula: 2*G/Pi, where G = X006752.
 * @author Georg Fischer
 */
public class A378910 extends DecimalExpansionSequence {

  private static final DecimalExpansionSequence A006752 = new A006752();

  /** Construct the sequence */
  public A378910() {
    super(0, A006752.getCR().multiply(2).divide(CR.PI));
  }
}
