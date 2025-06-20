package irvine.oeis.a232;
// Generated by gen_seq4.pl 2025-05-26.ack/filnum at 2025-05-26 23:11

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A232538 Numbers n such that (n(n+1)/2) modulo sigma(n) = n.
 * @author Georg Fischer
 */
public class A232538 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A232538() {
    super(1, 1, k -> Functions.TRIANGULAR.z(k).mod(Functions.SIGMA1.z(k)).equals(Z.valueOf(k)));
  }
}
