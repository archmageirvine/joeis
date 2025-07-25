package irvine.oeis.a232;
// Generated by gen_seq4.pl 2025-05-26.ack/filnum at 2025-05-26 23:11

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A232620 Numbers k such that (2k)!! mod (2k-1)!! is greater than (2k+2)!! mod (2k+1)!!.
 * @author Georg Fischer
 */
public class A232620 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A232620() {
    super(1, 1, k -> Functions.MULTIFACTORIAL.z(2, 2 * k).mod(Functions.MULTIFACTORIAL.z(2, 2 * k - 1)).compareTo(Functions.MULTIFACTORIAL.z(2, 2 * k + 2).mod(Functions.MULTIFACTORIAL.z(2, 2 * k + 1))) > 0);
  }
}
