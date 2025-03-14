package irvine.oeis.a320;
// Generated by gen_seq4.pl 2024-10-10.ack/lambdan at 2024-10-10 21:17

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A320465 a(n) = 2^n - (2^(n-1) mod n), where "mod" is the nonnegative remainder operator.
 * @author Georg Fischer
 */
public class A320465 extends LambdaSequence {

  /** Construct the sequence. */
  public A320465() {
    super(1, n -> Z.TWO.pow(n).subtract(Z.TWO.pow(n - 1).mod(Z.valueOf(n))));
  }
}
