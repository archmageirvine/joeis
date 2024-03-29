package irvine.oeis.a307;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.Conjectural;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A307272 Partial sums of A307202.
 * @author Georg Fischer
 */
public class A307272 extends HolonomicRecurrence implements Conjectural {


  /** Construct the sequence. */
  public A307272() {
    super(0, "[[0],[-1],[1],[0],[0],[2],[-2],[0],[0],[-1],[1]]", "[1, 4, 13, 28, 49, 73, 103, 145, 187, 232]", 0);
  }
}
