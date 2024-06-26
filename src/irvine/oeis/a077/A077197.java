package irvine.oeis.a077;
// Generated by gen_seq4.pl 2024-05-20/lambdan at 2024-05-20 22:40

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A077197 a(n) = lambda(phi(n)) where lambda(n) (A002322) is the Carmichael lambda function which gives the smallest integer m such that k^m = 1 mod n for all integers k relatively prime to n and phi(n) is A000010.
 * @author Georg Fischer
 */
public class A077197 extends LambdaSequence {

  /** Construct the sequence. */
  public A077197() {
    super(1, n -> Functions.CARMICHAEL_LAMBDA.z(Functions.PHI.z(n)));
  }
}
