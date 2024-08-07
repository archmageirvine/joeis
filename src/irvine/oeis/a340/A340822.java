package irvine.oeis.a340;
// Generated by gen_seq4.pl 2024-07-27.ack/lambdan at 2024-07-27 22:17

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A340822 a(n) = exp(-1) * Sum_{k&gt;=0} (k*(k + n))^n / k!.
 * @author Georg Fischer
 */
public class A340822 extends LambdaSequence {

  /** Construct the sequence. */
  public A340822() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(Functions.BELL.z(2 * n - k)).multiply(Z.valueOf(n).pow(Z.valueOf(k)))));
  }
}
