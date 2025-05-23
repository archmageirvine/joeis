package irvine.oeis.a250;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A250426 Number of (n+1)X(2+1) 0..1 arrays with nondecreasing sum of every two consecutive values in every row and column.
 * @author Georg Fischer
 */
public class A250426 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A250426() {
    super(1, "[0,36,36,-36,0,124,-20,-115,40,56,-26,-11,6]", "[1,-2,-4,10,5,-20,0,20,-5,-10,4,2,-1]");
  }
}
