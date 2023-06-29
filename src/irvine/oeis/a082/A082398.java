package irvine.oeis.a082;
// manually lingf at 2022-11-08

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A082398 Number of directed, diagonally convex polyominoes with n cells.
 * @author Georg Fischer
 */
public class A082398 extends PrependSequence {

  /** Construct the sequence. */
  public A082398() {
    super(1, new GeneratingFunctionSequence(1, "[0, 0, 1, -4, 6, -3, 1]", "[1, -7, 17, -17, 7, -1]").skip(2), 1, 0);
  }
}
