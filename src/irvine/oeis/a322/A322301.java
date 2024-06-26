package irvine.oeis.a322;
// Generated by gen_seq4.pl 2024-03-30/filter at 2024-03-30 20:29

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A322301 Primes p such that 5*2^p + 1 is also prime.
 * @author Georg Fischer
 */
public class A322301 extends FilterSequence {

  /** Construct the sequence. */
  public A322301() {
    super(1, new A000040(), p -> Z.TWO.pow(p).multiply(5).add(1).isProbablePrime());
  }
}
