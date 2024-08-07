package irvine.oeis.a363;
// Generated by gen_seq4.pl 2023-09-19/lambda at 2023-09-19 18:32

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A363974 Expansion of Sum_{k&gt;0} x^k / (1 - x^(2*k))^3.
 * @author Georg Fischer
 */
public class A363974 extends LambdaSequence {

  /** Construct the sequence. */
  public A363974() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> (d & 1) != 1 ? Z.ZERO : Binomial.binomial((d + 1) / 2 + 1, 2)));
  }
}
