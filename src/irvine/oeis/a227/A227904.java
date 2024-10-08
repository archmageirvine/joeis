package irvine.oeis.a227;
// Generated by gen_seq4.pl 2024-09-29.ack/filnum at 2024-09-29 22:15

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.FilterNumberSequence;

/**
 * A227904 Numbers k such that Sum_{j=1..k} antisigma(j) == 0 (mod sigma(k)).
 * @author Georg Fischer
 */
public class A227904 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A227904() {
    super(1, 1, k -> Integers.SINGLETON.sum(1, k, j -> Functions.ANTISIGMA.z(j)).mod(Functions.SIGMA1.z(k)).isZero());
  }
}
