package irvine.oeis.a307;
// Generated by gen_seq4.pl 2023-08-30/filter at 2023-08-31 21:50

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A307471 SanD primes with d = 14: p and p+d are both prime and digit sum A007953(p*(p+d)) = d.
 * @author Georg Fischer
 */
public class A307471 extends FilterSequence {

  /** Construct the sequence. */
  public A307471() {
    super(1, new A000040(), p -> p.add(14).isProbablePrime() && Functions.DIGIT_SUM.l(p.multiply(p.add(14))) == 14);
  }
}
