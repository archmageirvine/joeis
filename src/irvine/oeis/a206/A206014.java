package irvine.oeis.a206;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A206014 Number of (n+1) X 2 0..3 arrays with the number of clockwise edge increases in every 2 X 2 subblock unequal to the number of counterclockwise edge increases.
 * @author Georg Fischer
 */
public class A206014 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A206014() {
    super(1, "[0,104,160]", "[1,-5,-10]");
  }
}
