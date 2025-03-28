package irvine.oeis.a251;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A251049 Number of (n+1) X (2+1) 0..3 arrays with no 2 X 2 subblock having the sum of its diagonal elements greater than the absolute difference of its antidiagonal elements.
 * @author Georg Fischer
 */
public class A251049 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A251049() {
    super(1, "[0,290,-792,-640,4658,-7493,5116,-228,-1772,936,-113,-19]", "[1,-8,25,-35,7,49,-77,55,-20,3]");
  }
}
