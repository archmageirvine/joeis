package irvine.oeis.a252;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A252391 Number of (7+2) X (n+2) 0..3 arrays with every 3 X 3 subblock row and diagonal sum equal to 0 3 5 6 or 7 and every 3 X 3 column and antidiagonal sum not equal to 0 3 5 6 or 7.
 * @author Georg Fischer
 */
public class A252391 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A252391() {
    super(1, "[0,1051,903,1114,-2843,-1581,-1678,2255,683,467,-542,-93,12,7,2]", "[1,0,0,-4,0,0,4,0,0,-1]");
  }
}
