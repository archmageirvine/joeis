package irvine.oeis.a366;
// Generated by gen_seq4.pl 2024-07-27.ack/lambdan at 2024-07-27 22:17

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A366978 a(n) = Sum_{j=1..n} binomial(floor(n/j)+n,n+1).
 * @author Georg Fischer
 */
public class A366978 extends LambdaSequence {

  /** Construct the sequence. */
  public A366978() {
    super(1, n -> Integers.SINGLETON.sum(1, n, j -> Binomial.binomial(j + n - 1, n).multiply(Z.valueOf(n / j))));
  }
}
