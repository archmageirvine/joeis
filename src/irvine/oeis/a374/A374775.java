package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-08-02.ack/decexp at 2024-08-02 23:54

import irvine.math.cr.CR;
import irvine.oeis.a256.A256921;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A374775 Decimal expansion of (2 + gamma - log(Pi))/2.
 * Formula:
 * @author Georg Fischer
 */
public class A374775 extends DecimalExpansionSequence {

  private static final DecimalExpansionSequence A256921 = new A256921();

  /** Construct the sequence */
  public A374775() {
    super(0, CR.ONE.subtract(A256921.getCR()));
  }
}
