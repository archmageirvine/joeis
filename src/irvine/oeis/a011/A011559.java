package irvine.oeis.a011;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A011559 Stirling numbers of second kind S2(10,n).
 * @author Sean A. Irvine
 */
public class A011559 extends FiniteSequence {

  private static Z[] buildRow(final int row) {
    final Z[] res = new Z[row];
    for (int k = 0; k < row; ++k) {
      res[k] = Stirling.secondKind(row, k + 1);
    }
    return res;
  }

  protected A011559(final int row) {
    super(1, FINITE, buildRow(row));
  }

  /** Construct the sequence. */
  public A011559() {
    this(10);
  }
}
