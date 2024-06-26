package irvine.oeis.a130;
// Generated by gen_seq4.pl 2024-06-06/decexp at 2024-06-06 20:10

import irvine.math.cr.CR;
import irvine.oeis.a006.A006752;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A130834 Decimal expansion of the limit of the (2/n^2)-th power of the number of distinct dimer coverings on the n X n square grid, n even, as n goes to infinity.
 * Formula:
 * @author Georg Fischer
 */
public class A130834 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A130834() {
    super(1, new A006752().getCR().multiply(2).divide(CR.PI).exp());
  }
}
