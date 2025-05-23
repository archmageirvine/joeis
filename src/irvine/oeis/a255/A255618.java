package irvine.oeis.a255;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A255618 Number of length n+4 0..2 arrays with at most two downsteps in every 4 consecutive neighbor pairs.
 * @author Georg Fischer
 */
public class A255618 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A255618() {
    super(1, "[0,237,-17,-42,114,-386,-429,657,-216,81]", "[1,-3,0,1,-3,3,8,-9,3,-1]");
  }
}
