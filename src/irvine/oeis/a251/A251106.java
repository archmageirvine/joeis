package irvine.oeis.a251;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A251106 Number of (n+1) X (1+1) 0..2 arrays with no 2 X 2 subblock having the maximum of its diagonal elements greater than the absolute difference of its antidiagonal elements.
 * @author Georg Fischer
 */
public class A251106 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A251106() {
    super(1, "[0,37,-38,87,-91,65,-41,10]", "[1,-5,8,-13,12,-9,5,-1]");
  }
}
