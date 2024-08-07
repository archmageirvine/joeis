package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-06-24/lambdan at 2024-06-24 23:40

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A373905 a(n) = Sum_{k=0..floor(n/3)} binomial(n+3*k,n-3*k).
 * @author Georg Fischer
 */
public class A373905 extends LambdaSequence {

  /** Construct the sequence. */
  public A373905() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 3, k -> Binomial.binomial(n + 3L * k, n - 3L * k)));
  }
}
