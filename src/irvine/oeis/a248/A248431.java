package irvine.oeis.a248;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A248431 Number of length n+2 0..6 arrays with every three consecutive terms having the sum of some two elements equal to twice the third.
 * @author Georg Fischer
 */
public class A248431 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A248431() {
    super(1, "[0,61,105,185,-161,-239,-375,76,108,164]", "[1,0,0,-8,0,0,11,0,0,-4]");
  }
}
