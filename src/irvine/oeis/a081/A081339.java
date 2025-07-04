package irvine.oeis.a081;
// Generated by gen_seq4.pl 2025-05-26.ack/filnum at 2025-05-26 23:11

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A081339 Numbers n such that sigma(n^2) modulo 4 = 1.
 * @author Georg Fischer
 */
public class A081339 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A081339() {
    super(1, 1, k -> Functions.SIGMA1.z(Z.valueOf(k).multiply(k)).mod(4) == 1);
  }
}
