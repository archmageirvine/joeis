package irvine.oeis.a234;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A234780 Number of (n+1) X (2+1) 0..3 arrays with no adjacent elements equal and with each 2 X 2 subblock having the number of clockwise edge increases equal to the number of counterclockwise edge increases.
 * @author Georg Fischer
 */
public class A234780 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A234780() {
    super(1, "[0,484,-1084,360]", "[1,-16,31,-10]");
  }
}
