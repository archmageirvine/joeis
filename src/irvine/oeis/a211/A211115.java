package irvine.oeis.a211;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A211115 Number of (n+1) X (n+1) -2..2 symmetric matrices with every 2 X 2 subblock having sum zero and two or three distinct values.
 * @author Georg Fischer
 */
public class A211115 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A211115() {
    super(1, "[0,12,-34,-28,132,-14,-152,58,44,-20]", "[1,-5,4,16,-27,-8,35,-10,-10,4]");
  }
}
