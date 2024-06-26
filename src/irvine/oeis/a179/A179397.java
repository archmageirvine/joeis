package irvine.oeis.a179;
// Generated by gen_seq4.pl 2024-06-14/lambdan at 2024-06-14 23:07

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A179397 a(n) = prime(n)^2 mod prime(n-2).
 * @author Georg Fischer
 */
public class A179397 extends LambdaSequence {

  /** Construct the sequence. */
  public A179397() {
    super(3, n -> Functions.PRIME.z(n).square().mod(Functions.PRIME.z(n - 2)));
  }
}
