package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-03-26.ack/lambdan at 2025-03-26 22:40

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A381605 Number of distinct prime divisors of n^3+1.
 * @author Georg Fischer
 */
public class A381605 extends LambdaSequence {

  /** Construct the sequence. */
  public A381605() {
    super(1, n -> Functions.OMEGA.z(Z.valueOf(n).pow(3).add(1)));
  }
}
