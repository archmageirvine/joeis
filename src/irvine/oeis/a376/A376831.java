package irvine.oeis.a376;
// Generated by gen_seq4.pl 2024-10-08.ack/filnum at 2024-10-08 23:52

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A376831 Numbers k such that sigma(k + sigma(k)) = sigma(k) + sigma(sigma(k)), where sigma = A000203.
 * @author Georg Fischer
 */
public class A376831 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A376831() {
    super(1, 0, k -> Functions.SIGMA1.z(Functions.SIGMA1.z(k).add(k)).equals(Functions.SIGMA1.z(Functions.SIGMA1.z(k)).add(Functions.SIGMA1.z(k))));
  }
}
