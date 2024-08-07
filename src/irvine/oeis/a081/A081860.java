package irvine.oeis.a081;
// Generated by gen_seq4.pl 2024-07-26/lambdan at 2024-07-27 00:11

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A081860 a(n) = Sum_{k=0..n-1} sigma(2k+1)*sigma_3(n-k).
 * @author Georg Fischer
 */
public class A081860 extends LambdaSequence {

  /** Construct the sequence. */
  public A081860() {
    super(1, n -> Integers.SINGLETON.sum(0, n - 1, k -> Functions.SIGMA1.z(2 * k + 1).multiply(Functions.SIGMA.z(3, n - k))));
  }
}
