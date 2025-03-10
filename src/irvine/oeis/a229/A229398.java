package irvine.oeis.a229;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A229398 Number of n X 4 0..2 arrays with top left element 0, horizontal differences mod 3 never 1, vertical differences mod 3 never -1, and antidiagonal differences never 0.
 * @author Georg Fischer
 */
public class A229398 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A229398() {
    super(1, "[0,8,-38,71,-90,84,-50,17,-2]", "[1,-9,28,-47,55,-47,28,-9,1]");
  }
}
