package irvine.oeis.a223;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A223333 Rolling cube footprints: number of 4 X n 0..7 arrays starting with 0 where 0..7 label vertices of a cube and every array movement to a horizontal or antidiagonal neighbor moves along a corresponding cube edge.
 * @author Georg Fischer
 */
public class A223333 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A223333() {
    super(1, "[0,512,-22389,184197,-489823,375051,-112104,121716]", "[1,-48,402,-1064,789]");
  }
}
