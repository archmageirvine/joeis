package irvine.oeis.a220;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A220558 Number of ways to reciprocally link elements of an n X 4 array either to themselves or to exactly one horizontal or antidiagonal neighbor.
 * @author Georg Fischer
 */
public class A220558 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A220558() {
    super(1, "[0,5,-8,-2]", "[1,-11,17,-7,1]");
  }
}
