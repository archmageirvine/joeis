package irvine.oeis.a307;
// Generated by gen_seq4.pl 2024-07-02/lambdan at 2024-07-03 22:28

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A307893 a(n) = lcm(sigma(n), pod(n)) / n, where sigma (k) = the sum of divisors of k (A000203) and pod(n) = the product of divisors of k (A007955).
 * @author Georg Fischer
 */
public class A307893 extends LambdaSequence {

  /** Construct the sequence. */
  public A307893() {
    super(1, n -> Functions.LCM.z(Functions.SIGMA1.z(n), Functions.POD.z(n)).divide(n));
  }
}
