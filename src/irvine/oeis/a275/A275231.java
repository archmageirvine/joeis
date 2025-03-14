package irvine.oeis.a275;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A275231 Number of 6 X n 0..2 arrays with no element equal to any value at offset (-2,-1) (-2,1) or (-1,0) and new values introduced in order 0..2.
 * @author Georg Fischer
 */
public class A275231 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A275231() {
    super(1, "[0,16,-142,404,-436,154]", "[1,-19,75,-101,44]");
  }
}
