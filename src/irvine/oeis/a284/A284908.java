package irvine.oeis.a284;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A284908 a(n) = A000009(A000009(n)).
 * @author Georg Fischer
 */
public class A284908 extends LambdaSequence {

  /** Construct the sequence. */
  public A284908() {
    super(0, n -> Functions.DISTINCT_PARTITIONS.z(Functions.DISTINCT_PARTITIONS.z(n)));
  }
}
