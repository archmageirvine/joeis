package irvine.oeis.a358;
// Generated by gen_seq4.pl 2024-03-07/lambdan at 2024-03-07 22:01

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A358496 a(n) = Sum_{k=0..n} binomial(binomial(n, k), k).
 * @author Georg Fischer
 */
public class A358496 extends LambdaSequence {

  /** Construct the sequence. */
  public A358496() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(Binomial.binomial(n, k), Z.valueOf(k))));
  }
}
