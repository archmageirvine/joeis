package irvine.oeis.a265;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A265929 Number of 1 X n 0..4 arrays with the absolute differences of each element with its with horizontal and antidiagonal neighbors unique.
 * @author Georg Fischer
 */
public class A265929 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A265929() {
    super(1, "[0,5,10,27,64,31,10,-31,-212,-160]", "[1,-3,2,-10,-27,13,-28,20,96]");
  }
}
