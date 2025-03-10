package irvine.oeis.a335;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A335411 a(n) is the number of vertices formed by n-secting the angles of an equilateral triangle.
 * @author Georg Fischer
 */
public class A335411 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A335411() {
    super(1, "[0,3,4,11,0,24,0,24,0,24,-24,45,20,-11]", "[1,-1,-1,1,0,0,0,0,0,0,-1,1,1,-1]");
  }
}
