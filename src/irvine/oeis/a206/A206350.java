package irvine.oeis.a206;
// Generated by gen_seq4.pl 2024-09-29.ack/lambdan at 2024-09-29 22:15

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A206350 Position of 1/n in the canonical bijection from the positive integers to the positive rational numbers.
 * @author Georg Fischer
 */
public class A206350 extends LambdaSequence {

  /** Construct the sequence. */
  public A206350() {
    super(1, n -> (n <= 1) ? Z.ONE : Z.TWO.multiply(Integers.SINGLETON.sum(1, n - 1, k -> Functions.PHI.z(k))));
  }
}
