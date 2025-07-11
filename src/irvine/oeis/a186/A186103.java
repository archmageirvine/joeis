package irvine.oeis.a186;
// Generated by gen_seq4.pl 2025-05-27.ack/filnum at 2025-05-27 23:49

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A186103 Numbers k such that k | sigma(k-1) + sigma(k+1).
 * @author Georg Fischer
 */
public class A186103 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A186103() {
    super(1, 2, k -> Functions.SIGMA1.z(k - 1).add(Functions.SIGMA1.z(k + 1)).mod(k) == 0);
  }
}
