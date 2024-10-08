package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-09-11.ack/lambdan at 2024-09-11 23:28

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A375840 a(n) = Product_{k=0..n} (k^3 + n).
 * @author Georg Fischer
 */
public class A375840 extends LambdaSequence {

  /** Construct the sequence. */
  public A375840() {
    super(0, n -> Integers.SINGLETON.product(0, n, k -> Z.valueOf(k).pow(3).add(n)));
  }
}
