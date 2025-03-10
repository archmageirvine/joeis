package irvine.oeis.a243;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A243723 Number of length n+2 0..4 arrays with no three unequal elements in a row and no three equal elements in a row and new values 0..4 introduced in 0..4 order.
 * @author Georg Fischer
 */
public class A243723 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A243723() {
    super(1, "[0,3,-6,-12,16,13]", "[1,-4,0,13,-6,-8]");
  }
}
