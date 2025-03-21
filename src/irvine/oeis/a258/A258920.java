package irvine.oeis.a258;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A258920 Number of (n+2) X (3+2) 0..1 arrays with no 3 x 3 subblock diagonal sum equal to the antidiagonal sum or central row sum equal to the central column sum.
 * @author Georg Fischer
 */
public class A258920 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A258920() {
    super(1, "[0,1680,-1424,2368,-2288,-1392,864,-2368,2736,176,624,64,-352,-400]", "[1,-2,3,-4,2,0,-2,4,-3,2,-1]");
  }
}
