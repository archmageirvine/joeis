package irvine.oeis.a104;
// Generated by gen_seq4.pl 2024-06-24/lambdan at 2024-06-24 23:40

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A104658 Number of distinct prime factors of 23 concatenated n times.
 * @author Georg Fischer
 */
public class A104658 extends LambdaSequence {

  /** Construct the sequence. */
  public A104658() {
    super(1, n -> Functions.OMEGA.z(Z.valueOf(100).pow(n).multiply(23).subtract(23).divide(99)));
  }
}
