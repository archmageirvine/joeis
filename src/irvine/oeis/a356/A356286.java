package irvine.oeis.a356;
// Generated by gen_seq4.pl 2024-03-07/lambdan at 2024-03-07 22:01

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A356286 a(n) = Sum_{k=0..n} binomial(3*k, k) * p(k), where p(k) is the partition function A000041.
 * @author Georg Fischer
 */
public class A356286 extends LambdaSequence {

  /** Construct the sequence. */
  public A356286() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(3L * k, k).multiply(Functions.PARTITIONS.z(k))));
  }
}
