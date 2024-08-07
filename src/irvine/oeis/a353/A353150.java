package irvine.oeis.a353;
// Generated by gen_seq4.pl 2024-07-11/partsun at 2024-07-11 18:00

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a088.A088314;

/**
 * A353150 a(n) is the number of distinct pairs that can be made in exactly n iterations of either of the two maps (x, y) -&gt; (x OR (2^y), 0) or (x, y) -&gt; (x, y+1), starting from (0,0).
 * @author Georg Fischer
 */
public class A353150 extends PartialSumSequence {

  /** Construct the sequence. */
  public A353150() {
    super(0, new A088314());
  }
}
