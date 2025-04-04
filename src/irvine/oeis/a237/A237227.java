package irvine.oeis.a237;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A237227 Number of (n+1) X (1+1) 0..2 arrays with the maximum plus the minimum of every 2 X 2 subblock differing from its horizontal and vertical neighbors by exactly one.
 * @author Georg Fischer
 */
public class A237227 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A237227() {
    super(1, "[0,81,268,280,640,260,208,64]", "[1,0,-8,0,-24,0,-8]");
  }
}
