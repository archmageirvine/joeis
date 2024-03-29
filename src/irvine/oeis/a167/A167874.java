package irvine.oeis.a167;
// Generated by gen_seq4.pl 2023-10-16/simtraf at 2023-10-17 20:49

import irvine.oeis.a007.A007508;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A167874 The number of distinct primes &lt; 10^n which are members of twin-prime pairs.
 * @author Georg Fischer
 */
public class A167874 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A167874() {
    super(1, new A007508(), v -> v.multiply2().subtract(1));
  }
}
