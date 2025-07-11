package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-01.ack/lambdan at 2025-07-01 16:42

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A385394 a(n) = (Sum_{k=0..n} (binomial(n, k) mod 8)) / 2^bitcount(n).
 * @author Georg Fischer
 */
public class A385394 extends LambdaSequence {

  /** Construct the sequence. */
  public A385394() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).modZ(8)).divide(Z.TWO.pow(Functions.DIGIT_SUM.i(2, n))));
  }
}
