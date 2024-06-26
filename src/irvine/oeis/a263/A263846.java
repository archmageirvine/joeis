package irvine.oeis.a263;
// Generated by gen_seq4.pl 2024-06-26/lambdan at 2024-06-26 17:12

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A263846 Floor of cube root of n-th prime.
 * @author Georg Fischer
 */
public class A263846 extends LambdaSequence {

  /** Construct the sequence. */
  public A263846() {
    super(1, n -> Functions.CBRT.z(Functions.PRIME.z(n)));
  }
}
