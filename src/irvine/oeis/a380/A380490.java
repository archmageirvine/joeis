package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-01-31.ack/lambdan at 2025-01-31 23:19

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A380490 Replace prime digits of n by 0's.
 * @author Georg Fischer
 */
public class A380490 extends LambdaSequence {

  /** Construct the sequence. */
  public A380490() {
    super(1, n -> new Z(Z.valueOf(n).toString().replaceAll("[2357]", "0")));
  }
}
