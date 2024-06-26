package irvine.oeis.a064;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A064688 a(n) = number of partitions of primes into distinct (also odd) parts.
 * @author Georg Fischer
 */
public class A064688 extends LambdaSequence {

  /** Construct the sequence. */
  public A064688() {
    super(1, n -> Functions.DISTINCT_PARTITIONS.z(Functions.PRIME.z(n)));
  }
}
