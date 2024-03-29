package irvine.oeis.a183;
// Generated by ./gen_seq4.pl /diffseq0 at 2022-06-26 10:36

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A183117 Magnetic Tower of Hanoi, number of moves of disk number k, optimally solving the [NEUTRAL ; NEUTRAL ; NEUTRAL] pre-colored puzzle.
 * @author Sean A. Irvine
 */
public class A183117 extends DifferenceSequence {

  /** Construct the sequence. */
  public A183117() {
    super(new PrependSequence(new A183118(), 0));
  }
}
