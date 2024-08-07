package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-07-27.ack/lambdan at 2024-07-27 22:17

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A367833 a(n) = Product_{k=0..n} (n^8 + k^8).
 * @author Georg Fischer
 */
public class A367833 extends LambdaSequence {

  /** Construct the sequence. */
  public A367833() {
    super(0, n -> Integers.SINGLETON.product(0, n, k -> Z.valueOf(n).pow(Z.EIGHT).add(Z.valueOf(k).pow(Z.EIGHT))));
  }
}
