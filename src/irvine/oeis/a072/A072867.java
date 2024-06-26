package irvine.oeis.a072;
// Generated by gen_seq4.pl 2024-06-19/lambdan at 2024-06-19 23:57

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A072867 A Ramanujan congruence modulo 11^2 related to partition numbers: a(n) = p(121*n-5)/121 where p(k) is the k-th partition number.
 * @author Georg Fischer
 */
public class A072867 extends LambdaSequence {

  /** Construct the sequence. */
  public A072867() {
    super(1, n -> Functions.PARTITIONS.z(121 * n - 5).divide(121));
  }
}
