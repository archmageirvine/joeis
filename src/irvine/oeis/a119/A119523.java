package irvine.oeis.a119;
// Generated by gen_seq4.pl 2024-06-07/decexp at 2024-06-09 22:55

import irvine.oeis.a051.A051006;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A119523 Decimal expansion of 2^-1 + 2^-2 + 2^-4 + 2^-6 + 2^-10 + ..., where the exponents are 1 less than the primes.
 * Formula: =1/2+1/4+1/16+1/64+1/1024+1/4096+1/65536+
 * @author Georg Fischer
 */
public class A119523 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A119523() {
    super(0, new A051006().getCR().multiply(2));
  }
}
