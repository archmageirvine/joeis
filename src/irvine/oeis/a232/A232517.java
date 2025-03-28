package irvine.oeis.a232;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A232517 Number of (2+1)X(n+1) 0..2 arrays with every element next to itself plus and minus one within the range 0..2 horizontally, diagonally or antidiagonally, with no adjacent elements equal.
 * @author Georg Fischer
 */
public class A232517 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A232517() {
    super(1, "[0,4,52,8,10,-6,-10,-10]", "[1,0,-6,-1,-3,-1,2,2]");
  }
}
