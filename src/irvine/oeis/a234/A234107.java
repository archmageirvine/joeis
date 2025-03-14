package irvine.oeis.a234;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A234107 Number of (n+1) X (1+1) 0..4 arrays with every 2 X 2 subblock having the sum of the absolute values of all six edge and diagonal differences equal to 12.
 * @author Georg Fischer
 */
public class A234107 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A234107() {
    super(1, "[0,56,-94,-662,728,1424,-304]", "[1,-5,-6,50,-16,-80,16]");
  }
}
