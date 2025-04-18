package irvine.oeis.a298;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A298163 Number of n X 4 0..1 arrays with every element equal to 3, 4, 5 or 8 king-move adjacent elements, with upper left element zero.
 * @author Georg Fischer
 */
public class A298163 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A298163() {
    super(1, "[0,0,2,-2,-2,-2,1,2]", "[1,-2,-1,1,2,2,-1,-1]");
  }
}
