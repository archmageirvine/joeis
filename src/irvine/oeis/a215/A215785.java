package irvine.oeis.a215;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A215785 Number of permutations of 0..floor((n*7-1)/2) on even squares of an n X 7 array such that each row, column, diagonal and (downwards) antidiagonal of even squares is increasing.
 * @author Georg Fischer
 */
public class A215785 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A215785() {
    super(1, "[0,1,5,-19,-43,2,-2]", "[1,0,-61,0,99,0,2]");
  }
}
