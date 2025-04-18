package irvine.oeis.a215;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A215866 Number of permutations of 0..floor((n*6-2)/2) on odd squares of an n X 6 array such that each row, column, diagonal and (downwards) antidiagonal of odd squares is increasing.
 * @author Georg Fischer
 */
public class A215866 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A215866() {
    super(1, "[0,1,5,-4,-2]", "[1,0,-16,0,3]");
  }
}
