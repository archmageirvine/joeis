package irvine.oeis.a252;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A252716 Number of (n+2) X (5+2) 0..3 arrays with every consecutive three elements in every row and diagonal having exactly two distinct values, and in every column and antidiagonal not having exactly two distinct values, and new values 0 upwards introduced in row major order.
 * @author Georg Fischer
 */
public class A252716 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A252716() {
    super(1, "[0,129,-60,17,-748,395,-35,1208,-715,-51,-367,219,24]", "[1,-1,0,-6,6,0,10,-10,0,-3,3]");
  }
}
