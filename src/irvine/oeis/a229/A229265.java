package irvine.oeis.a229;
// Generated by gen_seq4.pl 2024-07-10/filnum at 2024-07-10 23:36

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A229265 Numbers n such that sigma(n) + tau(n) + phi(n) is a prime, where sigma(n) = A000203(n), tau(n) = A000005(n) and phi(n) = A000010(n).
 * @author Georg Fischer
 */
public class A229265 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A229265() {
    super(1, 1, n -> Functions.SIGMA1.z(n).add(Functions.TAU.z(n)).add(Functions.PHI.z(n)).isProbablePrime());
  }
}
