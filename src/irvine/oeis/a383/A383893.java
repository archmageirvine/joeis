package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-05-22.ack/lambdan at 2025-05-22 22:55

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A383893 Expansion of 1/( ((1-x)*(1-2*x)*(1-3*x)*(1-4*x)*(1-5*x))^2 * (1-6*x) ).
 * @author Georg Fischer
 */
public class A383893 extends LambdaSequence {

  /** Construct the sequence. */
  public A383893() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Functions.STIRLING2.z(k + 5, 5).multiply(Functions.STIRLING2.z(n - k + 6, 6))));
  }
}
