package irvine.oeis.a134;
// Generated by gen_seq4.pl concatf/concatn at 2022-12-30 21:49

import irvine.oeis.a065.A065091;
import irvine.oeis.a133.A133013;

/**
 * A134723 Concatenation of next n odd primes.
 * @author Georg Fischer
 */
public class A134723 extends A133013 {

  /** Construct the sequence. */
  public A134723() {
    super(1, new A065091(), 10);
  }
}
