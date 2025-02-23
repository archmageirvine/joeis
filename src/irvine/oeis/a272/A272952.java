package irvine.oeis.a272;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A272952 Number of n X 2 0..1 arrays with exactly n+2-2 having value 1 and no three 1s forming an isosceles right triangle.
 * @author Georg Fischer
 */
public class A272952 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A272952() {
    super(1, "[0,2,4,-2,-3,1,1]", "[1,-1,-3,2,3,-1,-1]");
  }
}
