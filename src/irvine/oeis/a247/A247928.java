package irvine.oeis.a247;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A247928 Number of length 1+4 0..n arrays with some disjoint pairs in every consecutive five terms having the same sum.
 * @author Georg Fischer
 */
public class A247928 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A247928() {
    super(1, "[0,32,139,418,749,969,1063,1021,691,679,-2,1]", "[1,-2,0,1,0,2,-2,0,-1,0,2,-1]");
  }
}
