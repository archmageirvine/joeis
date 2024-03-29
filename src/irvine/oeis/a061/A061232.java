package irvine.oeis.a061;
// Generated by gen_seq4.pl deris/diffseq at 2022-10-26 15:17

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a003.A003604;

/**
 * A061232 Number of primes p with n! &lt; p &lt;= (n+1)!.
 * @author Georg Fischer
 */
public class A061232 extends DifferenceSequence {

  /** Construct the sequence. */
  public A061232() {
    super(new A003604());
  }
}
