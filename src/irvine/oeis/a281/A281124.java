package irvine.oeis.a281;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A281124 Number of n X 2 0..2 arrays with no element equal to more than one of its horizontal, vertical and antidiagonal neighbors, with the exception of exactly one element, and with new values introduced in order 0 sequentially upwards.
 * @author Georg Fischer
 */
public class A281124 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A281124() {
    super(1, "[0,0,2,12,0,-16,-6]", "[1,-8,8,30,24,8,1]");
  }
}
