package irvine.oeis.a282;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A282785 Number of n X 2 0..1 arrays with no 1 equal to more than one of its king-move neighbors, with the exception of exactly one element.
 * @author Georg Fischer
 */
public class A282785 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A282785() {
    super(1, "[0,0,0,8]", "[1,-2,-5,-2,17,24,16]");
  }
}
