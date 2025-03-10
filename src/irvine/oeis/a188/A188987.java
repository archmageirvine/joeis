package irvine.oeis.a188;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A188987 Number of n X 4 binary arrays without the pattern 0 0 1 antidiagonally or horizontally.
 * @author Georg Fischer
 */
public class A188987 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A188987() {
    super(1, "[0,12,36,-40,-60,120,-72,16]", "[1,-9,0,36,-24,-36,48,-16]");
  }
}
