package irvine.oeis.a258;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A258892 Number of (n+2) X (6+2) 0..1 arrays with no 3 x 3 subblock diagonal sum less than the antidiagonal sum or central row sum less than the central column sum.
 * @author Georg Fischer
 */
public class A258892 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A258892() {
    super(1, "[0,94249,-137310,-270710,436011,256742,-482695,-87878,207141,17437,-23035,-9760]", "[1,-2,-2,6,0,-6,2,2,-1]");
  }
}
