package irvine.oeis.a233;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A233885 Number of (n+1) X (1+1) 0..6 arrays with every 2 X 2 subblock having the sum of the squares of the edge differences equal to 30, and no two adjacent values equal.
 * @author Georg Fischer
 */
public class A233885 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A233885() {
    super(1, "[0,112,384,-752,-3068,624,5828,224,-3760,-88,720]", "[1,0,-18,-4,95,30,-165,-36,105,8,-20]");
  }
}
