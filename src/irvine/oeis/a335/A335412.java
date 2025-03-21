package irvine.oeis.a335;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A335412 a(n) is the number of edges formed by n-secting the angles of an equilateral triangle.
 * @author Georg Fischer
 */
public class A335412 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A335412() {
    super(1, "[0,3,9,24,6,42,6,42,6,42,-30,75,33,-18]", "[1,-1,-1,1,0,0,0,0,0,0,-1,1,1,-1]");
  }
}
