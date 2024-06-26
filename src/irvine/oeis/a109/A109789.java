package irvine.oeis.a109;
// Generated by gen_seq4.pl 2024-04-24/lambdan at 2024-04-24 18:19

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A109789 a(n) = prime(1^3) + prime(2^3) + prime(3^3) + ... + prime(n^3).
 * @author Georg Fischer
 */
public class A109789 extends LambdaSequence {

  /** Construct the sequence. */
  public A109789() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Functions.PRIME.z(k * k * k)));
  }
}
