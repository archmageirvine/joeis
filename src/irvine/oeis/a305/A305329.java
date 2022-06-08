package irvine.oeis.a305;
// manually compleq at 2022-06-08 15:43
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.ComplementaryEquationSequence;

/**
 * A305329 Solution (a(n)) of the complementary equation a(n) = 2*a(n-1) - a(n-2) + b(n-2); see Comments.
 * @author Georg Fischer
 */
public class A305329 extends ComplementaryEquationSequence {

  /** Construct the sequence. */
  public A305329() {
    super(0, "[[0],[-1],[2],[-1]]", new String[] {"[1, 2]", "[3, 4, 5]"});
  }

  protected A305329(final int hereSeqNo, final String matrix, final String[] initTerms) {
    super(hereSeqNo, matrix, initTerms);
  }

  @Override
  public Z adjunct(final int n) {
    return Z.valueOf(b(n - 2));
  }

}
