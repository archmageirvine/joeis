package irvine.oeis.a236;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A236048 Number of (n+1) X (1+1) 0..2 arrays colored with the difference of the maximum and minimum in each 2 X 2 subblock.
 * @author Georg Fischer
 */
public class A236048 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A236048() {
    super(1, "[0,81,292,383,808,596,560,176,64]", "[1,0,-9,-4,-24,-12,-8]");
  }
}
