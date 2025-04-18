package irvine.oeis.a206;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A206121 Number of (n+1) X 2 0..2 arrays with every 2 X 2 subblock having nonzero determinant and having the same number of clockwise edge increases as its horizontal and vertical neighbors.
 * @author Georg Fischer
 */
public class A206121 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A206121() {
    super(1, "[0,50,70,-432,-970,-650,62,-20,-64,-2]", "[1,-2,-13,9,50,43,-4,0,4]");
  }
}
