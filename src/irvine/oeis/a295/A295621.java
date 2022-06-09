package irvine.oeis.a295;
// manually compleq at 2022-06-08 15:43
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.recur.ComplementaryEquationSequence;

/**
 * A295621 Solution of the complementary equation a(n) = a(n-1) + 3*a(n-2) -2*a(n-3) - 2*a(n-4) + b(n-4), where a(0) = 1, a(1) = 2, a(2) = 3, a(3) = 4, b(0) = 5, b(1) = 6, b(2) = 7, b(3) = 8, and (a(n)) and (b(n)) are increasing complementary sequences.
 * @author Georg Fischer
 */
public class A295621 extends ComplementaryEquationSequence {

  /** Construct the sequence. */
  public A295621() {
    super(0, "[[0],[-2],[-2],[3],[1],[-1]]", new String[] {"[1, 2, 3, 4]", "[5, 6, 7, 8]"});
  }

  protected A295621(final int hereSeqNo, final String matrix, final String[] initTerms) {
    super(hereSeqNo, matrix, initTerms);
  }

  @Override
  public Z adjunct(final int n) {
    return Z.valueOf(b(n - 3));
  }

}
