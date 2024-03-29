package irvine.oeis.a064;
// Generated by gen_seq4.pl inverse at 2022-05-26 21:12

import irvine.oeis.InverseSequence;
import irvine.oeis.a048.A048673;

/**
 * A064216 Replace each p^e with prevprime(p)^e in the prime factorization of odd numbers; inverse of sequence A048673 considered as a permutation of the natural numbers.
 * @author Georg Fischer
 */
public class A064216 extends InverseSequence {

  /** Construct the sequence. */
  public A064216() {
    super(new A048673(), 1, 1);
  }
}
