package irvine.oeis.a364;
// Generated by gen_seq4.pl 2024-01-23/lambdan at 2024-01-25 00:21

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A364194 a(n) = Sum_{k=1..n} k^3*sigma(k), where sigma is A000203.
 * @author Georg Fischer
 */
public class A364194 extends LambdaSequence {

  /** Construct the sequence. */
  public A364194() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Z.valueOf(k).pow(3).multiply(Functions.SIGMA1.z(k))));
  }
}
