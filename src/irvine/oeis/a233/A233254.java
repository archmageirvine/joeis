package irvine.oeis.a233;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A233254 Number of n X 6 0..5 arrays with no element x(i,j) adjacent to itself or value 5-x(i,j) horizontally or antidiagonally, top left element zero, and 1 appearing before 2 3 and 4, and 2 appearing before 3 in row major order (unlabelled 6-colorings with no clashing color pairs).
 * @author Georg Fischer
 */
public class A233254 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A233254() {
    super(1, "[0,136,-59904,7798784,-320864256]", "[1,-1664,471040,-44826624,1358954496]");
  }
}
