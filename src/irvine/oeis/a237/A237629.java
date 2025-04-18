package irvine.oeis.a237;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A237629 Number of (n+1) X (n+1) 0..2 arrays with the upper median of every 2 X 2 subblock differing from its horizontal and vertical neighbors by exactly one.
 * @author Georg Fischer
 */
public class A237629 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A237629() {
    super(1, "[0,81,636,986,-532,-2643,-14580,-24794,20120,44610,1100,-4392]", "[1,0,-4,0,-25,0,100]");
  }
}
