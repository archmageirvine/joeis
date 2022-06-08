package irvine.oeis.a296;
// manually compleq/compl_p at 2022-06-08 15:43
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.recur.ComplementaryEquationSequence;

/**
 * A296003 Solution of the complementary equation a(n) = a(0)*b(n-1) + a(1)*b(n-2) + ... + a(n-1)*b(0), where a(0) = 2, a(1) = 4, b(0) = 1, and (a(n)) and (b(n)) are increasing complementary sequences.
 * @author Georg Fischer
 */
public class A296003 extends ComplementaryEquationSequence {

  /** Construct the sequence. */
  public A296003() {
    super(0, "[[0],[-1]]", new String[] {"[2, 4]", "[1]"});
  }

  protected A296003(final int hereSeqNo, final String matrix, final String[] initTerms) {
    super(hereSeqNo, matrix, initTerms);
  }

  @Override
  public Z adjunct(final int n) { // sum a(0)*b(n-1) + a(1)*b(n-2) + ... + a(n-1)*b(0)
    Z sum = Z.ZERO;
    for (int ib = 0; ib < n; ++ib) {
      sum = sum.add(aZ(n - 1 - ib).multiply(Z.valueOf(b(ib))));
    }
    return sum;
  }

}
