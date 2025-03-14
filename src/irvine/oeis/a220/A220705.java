package irvine.oeis.a220;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A220705 Number of ways to reciprocally link elements of an n X 5 array either to themselves or to exactly two horizontal and antidiagonal neighbors, without consecutive collinear links.
 * @author Georg Fischer
 */
public class A220705 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A220705() {
    super(1, "[0,1,3,-1,-2,-2,-1]", "[1,-2,-3,0,1,2,1]");
  }
}
