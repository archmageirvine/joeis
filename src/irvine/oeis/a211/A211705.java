package irvine.oeis.a211;
// Generated by gen_seq4.pl 2024-06-07/decexp at 2024-06-09 22:55

import irvine.oeis.a065.A065442;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A211705 Decimal expansion of Sum_{n&gt;=1} A006218(n)*2^(-n).
 * Formula:
 * @author Georg Fischer
 */
public class A211705 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A211705() {
    super(1, new A065442().getCR().multiply(2));
  }
}
