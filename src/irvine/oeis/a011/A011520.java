package irvine.oeis.a011;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A011520 Stirling numbers of first kind S1(10,n).
 * @author Sean A. Irvine
 */
public class A011520 extends FiniteSequence {

  private static Z[] buildRow(final int row) {
    final Z[] res = new Z[row];
    for (int k = 0; k < row; ++k) {
      res[k] = Functions.STIRLING1.z(row, k + 1);
    }
    return res;
  }

  protected A011520(final int row) {
    super(1, FINITE, buildRow(row));
  }

  /** Construct the sequence. */
  public A011520() {
    this(10);
  }
}
