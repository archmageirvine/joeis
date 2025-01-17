package irvine.oeis.a193;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A193644 Number of arrays of -4..4 integers x(1..n) with every x(i) in a subsequence of length 1 or 2 with sum zero.
 * @author Georg Fischer
 */
public class A193644 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A193644() {
    super(1, "[0,1,7,1]", "[1,-2,-6,-1]");
  }
}
