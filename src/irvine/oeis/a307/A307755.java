package irvine.oeis.a307;
// Generated by gen_seq4.pl 2024-07-01/lambdan at 2024-07-01 18:26

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A307755 Exponential convolution of partition numbers (A000041) with themselves.
 * @author Georg Fischer
 */
public class A307755 extends LambdaSequence {

  /** Construct the sequence. */
  public A307755() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(Functions.PARTITIONS.z(k)).multiply(Functions.PARTITIONS.z(n - k))));
  }
}
