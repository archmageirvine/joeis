package irvine.oeis.a223;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A223328 Rolling cube footprints: number of n X 5 0..7 arrays starting with 0 where 0..7 label vertices of a cube and every array movement to a horizontal or antidiagonal neighbor moves along a corresponding cube edge.
 * @author Georg Fischer
 */
public class A223328 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A223328() {
    super(1, "[0,81,-216]", "[1,-117,294]");
  }
}
