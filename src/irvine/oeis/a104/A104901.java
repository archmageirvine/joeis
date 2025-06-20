package irvine.oeis.a104;
// Generated by gen_seq4.pl 2025-06-03.ack/filnum at 2025-06-03 20:14

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A104901 Numbers n such that sigma(n) = 8*phi(n).
 * @author Georg Fischer
 */
public class A104901 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A104901() {
    super(1, 1, k -> Functions.SIGMA1.z(k).equals(Functions.PHI.z(k).multiply(8)));
  }
}
