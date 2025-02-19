package irvine.oeis.a188;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A188839 Number of n X 5 binary arrays without the pattern 0 1 diagonally or vertically.
 * @author Georg Fischer
 */
public class A188839 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A188839() {
    super(1, "[0,32,-48,-20,64,-20,-12,4,1]", "[1,-6,15,-20,15,-6,1]");
  }
}
