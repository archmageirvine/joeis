package irvine.oeis.a208;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A208016 Number of 6 X n 0..1 arrays avoiding 0 0 0 and 1 0 1 horizontally and 0 0 1 and 0 1 1 vertically.
 * @author Georg Fischer
 */
public class A208016 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A208016() {
    super(1, "[0,16,240,480,2601,3015,-3915,-15228,-8505]", "[1,-1,-3,-21,-9,27,81]");
  }
}
