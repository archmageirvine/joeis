package irvine.oeis.a369;
// Generated by gen_seq4.pl 2024-03-14g/lambdan at 2024-03-14 21:15

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A369681 a(n) = Product_{k=0..n} (4^k + 5^(n-k)).
 * @author Georg Fischer
 */
public class A369681 extends LambdaSequence {

  /** Construct the sequence. */
  public A369681() {
    super(0, n -> Integers.SINGLETON.product(0, n, k -> Z.FOUR.pow(k).add(Z.FIVE.pow(n - k))));
  }
}
