package irvine.oeis.a100;
// manually 2025-02-02.ack/filprim at 2025-02-02 21:08

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A100906 Numbers n such that (14^n+1)^2-2 is prime.
 * @author Georg Fischer
 */
public class A100906 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A100906() {
    super(1, 1, k -> Z.valueOf(14).pow(k).add(1).square().subtract(2).isProbablePrime());
  }
}
