package irvine.oeis.a246;
// Generated by gen_seq4.pl 2024-03-14g/lambdan at 2024-03-14 21:15

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A246933 a(n) = prime(16*n).
 * @author Georg Fischer
 */
public class A246933 extends LambdaSequence {

  /** Construct the sequence. */
  public A246933() {
    super(1, n -> Functions.PRIME.z(16 * n));
  }
}
