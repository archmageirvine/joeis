package irvine.oeis.a228;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A228794 Number of n X 6 binary arrays with top left element equal to 1 and no two ones adjacent horizontally or nw-se.
 * @author Georg Fischer
 */
public class A228794 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A228794() {
    super(1, "[0,8,-70,232,-560,116,-2512,1110]", "[1,-21,112,-217,157,-36]");
  }
}
