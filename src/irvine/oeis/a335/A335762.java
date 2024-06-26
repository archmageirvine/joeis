package irvine.oeis.a335;
// Generated by gen_seq4.pl 2024-06-07/decexp at 2024-06-09 22:55

import irvine.oeis.a013.A013661;
import irvine.oeis.a065.A065465;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A335762 Decimal expansion of Product_{p prime} (1 + p/((p-1)*(p+1)^2)).
 * Formula:
 * @author Georg Fischer
 */
public class A335762 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A335762() {
    super(1, new A013661().getCR().multiply(new A065465().getCR()));
  }
}
