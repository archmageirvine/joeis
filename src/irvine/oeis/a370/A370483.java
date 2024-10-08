package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-07-27.ack/lambdan at 2024-07-27 22:17

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A370483 a(n) = Product_{k=0..n} binomial(n^2 + k^2, k^2).
 * @author Georg Fischer
 */
public class A370483 extends LambdaSequence {

  /** Construct the sequence. */
  public A370483() {
    super(0, n -> Integers.SINGLETON.product(0, n, k -> Binomial.binomial(Z.valueOf(n).square().add(Z.valueOf(k).square()), Z.valueOf(k).square())));
  }
}
