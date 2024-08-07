package irvine.oeis.a258;
// Generated by gen_seq4.pl 2024-07-02/lambdan at 2024-07-03 22:28

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A258594 Number of prime factors of the number of partitions of n into distinct parts, a(n) = A001222(A000009(n)).
 * @author Georg Fischer
 */
public class A258594 extends LambdaSequence {

  /** Construct the sequence. */
  public A258594() {
    super(0, n -> Functions.BIG_OMEGA.z(Functions.DISTINCT_PARTITIONS.z(n)));
  }
}
