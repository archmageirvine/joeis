package irvine.oeis.a293;
// Generated by gen_seq4.pl 2024-09-21.ack/lambdan at 2024-09-21 22:07

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A293469 a(n) = Sum_{k=0..n} (2*k-1)!!*binomial(2*n-k, n).
 * @author Georg Fischer
 */
public class A293469 extends LambdaSequence {

  /** Construct the sequence. */
  public A293469() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Functions.MULTIFACTORIAL.z(2, 2L * k - 1).multiply(Binomial.binomial(2L * n - k, n))));
  }
}
