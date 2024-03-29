package irvine.oeis.a066;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.oeis.MultiplicativeSequence;

/**
 * A066990 In canonical prime factorization of n replace even exponents with 2 and odd exponents with 1.
 * @author Georg Fischer
 */
public class A066990 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A066990() {
    super(1, (p, e) -> p.pow(2 - e % 2));
  }
}
