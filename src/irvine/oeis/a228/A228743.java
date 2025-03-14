package irvine.oeis.a228;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A228743 Number of arrays of the median of three adjacent elements of some length 8 0..n array.
 * @author Georg Fischer
 */
public class A228743 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A228743() {
    super(1, "[0,50,97,-7,-70,24,-7,1]", "[1,-7,21,-35,35,-21,7,-1]");
  }
}
