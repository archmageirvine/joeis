package irvine.oeis.a200;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A200273 Number of 0..n arrays x(0..5) of 6 elements with zero 3rd differences.
 * @author Georg Fischer
 */
public class A200273 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A200273() {
    super(1, "[0,2,3,6,7,11,17,22,24,26,33,31,32,26,26,21,15,10,8,6,3,3,1,0,-1]", "[1,0,0,-1,0,-1,-1,0,1,1,-1,1,0,1,-1,1,1,0,-1,-1,0,-1,0,0,1]");
  }
}
