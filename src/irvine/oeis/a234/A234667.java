package irvine.oeis.a234;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A234667 Number of (n+1) X (1+1) 0..7 arrays with every 2 X 2 subblock having its diagonal sum differing from its antidiagonal sum by 4 (constant-stress 1 X 1 tilings).
 * @author Georg Fischer
 */
public class A234667 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A234667() {
    super(1, "[0,492,-3072,-36156,187320,425832,-322560,-645120]", "[1,-14,-25,950,-2091,-7326,3780,10080]");
  }
}
