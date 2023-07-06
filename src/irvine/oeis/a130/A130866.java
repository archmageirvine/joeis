package irvine.oeis.a130;
// manually partsum2 at 2022-12-26 20:38

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000105;

/**
 * A130866 Number of polyominoes (or square animals) with at most n cells.
 * @author Georg Fischer
 */
public class A130866 extends PartialSumSequence {

  /** Construct the sequence. */
  public A130866() {
    super(1, new A000105().skip(1));
  }
}
